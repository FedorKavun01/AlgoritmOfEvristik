import kotlin.math.sqrt

class Evristik(val firstMetod: FirstMetod, val points: ArrayList<Point>) {
    var clasters: ArrayList<Claster> = ArrayList()
    var firstZ: Point = if (firstMetod == FirstMetod.FIRST) points.get(0) else if (firstMetod == FirstMetod.LAST) points.get(points.count() - 1) else points.get((0 until points.count()).random())
    var T: ArrayList<Int> = ArrayList()

    fun pointsMinus(x: Point, z: Point): Point {
        return Point(x.x - z.x, x.y - z.y)
    }

    fun simpleEvristikAlgorithm(): Unit {
        var D: Double
        var xMinusZ: Point
        T.forEach{
            for (point in points) {
                if (clasters.isEmpty()) {
                    clasters.add(Claster(ArrayList(), firstZ))
                    continue
                }
                for (claster in clasters) {
                    xMinusZ = pointsMinus(point, claster.z)
                    D = Math.sqrt(xMinusZ.x * xMinusZ.x + xMinusZ.y * xMinusZ.y)
                    if (D <= it) {
                        claster.points.add(point)
                        break
                    } else {
                        clasters.add(Claster(ArrayList(), point))
                        break
                    }
                }
            }
            println(clasters)
            print("z = ")
            clasters.forEach{print("${it.z} ")}
            println()
            println("${clasters.count()}")
            println()
            clasters.forEach {  }

            clasters.forEach{
                val averageDist = averageDistTo(it)
                val disperce = findDisperce(it, averageDist)
                val minMax = findMinMaxDistance(it)

                println("${averageDist}, ")
                println()
                println("Disperce = ${disperce}")
                println()
                println("AvarageSqr = ${Math.sqrt(disperce)}")
                println()
                println("min = ${minMax.first}")
                println("max = ${minMax.second}")

                if (clasters.count() > 0 && clasters.indexOf(it) < clasters.count() - 1) {
                    println("Distance to next z ${getDistanceTo(it.z, clasters.get(clasters.indexOf(it) + 1).z)}")
                }

                println("-----------------------------------------------------")
            }

            println()
            println("=============================================================")

            clasters.clear()
        }
    }

    fun averageDistTo(claster: Claster): Double {
        var sum = 0.0
        var distance = 0.0
        claster.points.forEach {
            distance = getDistanceTo(it, claster.z)
            sum += distance
        }

        return sum / claster.points.count()
    }

    fun findDisperce(claster: Claster, averageDistTo: Double): Double {
        var sum = 0.0
        var disperce = 0.0
        claster.points.forEach {
            sum += Math.pow(getDistanceTo(it, claster.z) - averageDistTo, 2.0)
        }
        disperce = sum / (claster.points.count() - 1)
        return disperce
    }

    fun findMinMaxDistance(claster: Claster): Pair<Double, Double> {
        var min = if (claster.points.count() > 0) getDistanceTo(claster.points.get(0), claster.z) else 0.0
        var max = if (claster.points.count() > 0) getDistanceTo(claster.points.get(0), claster.z) else 0.0
        var distance = 0.0

        claster.points.forEach {
            distance = getDistanceTo(it, claster.z)

            if (distance > max) {
                max = distance
            }

            if (distance < min) {
                min = distance
            }
        }

        return Pair(min, max)
    }

    fun getDistanceTo(point: Point, z: Point): Double {
        return sqrt(Math.pow(point.x - z.x, 2.0) + Math.pow(point.y - z.y, 2.0))
    }
}

enum class FirstMetod {
    FIRST,
    LAST,
    RANDOM
}