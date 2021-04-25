fun main(args: Array<String>) {
    // Variant #1

    var variant = arrayListOf<Point>(Point(7.1, 7.03), Point(2.79, 7.54), Point(3.34, 5.17), Point(7.2, 3.06), Point(5.92, 7.28),
        Point(4.44, 3.73), Point(-4.47, 6.41), Point(-6.42, 7.56), Point(-7.25, 6.16), Point(-8.45, 4.28), Point(-2.89, 2.69),
        Point(-5.8, 5.06), Point(-5.92, 2.69), Point(0.74, -2.66), Point(-1.29, -2.94), Point(-2.89, -5.71), Point(2.37, -7.23),
        Point(-2.02, -8.42), Point(-1.62, -5.12), Point(2.29, -5.12), Point(0.54, -6.4))

    var tVar = arrayListOf<Int>(2, 5, 7, 9, 12)
    var evristik: Evristik

    println("Variant #1")

    evristik = Evristik(FirstMetod.FIRST, variant)
    evristik.T = tVar
    evristik.simpleEvristikAlgorithm()

    println("--------------------------------------------------------")

    evristik = Evristik(FirstMetod.LAST, variant)
    evristik.T = tVar
    evristik.simpleEvristikAlgorithm()

    println("--------------------------------------------------------")

    evristik = Evristik(FirstMetod.RANDOM, variant)
    evristik.T = tVar
    evristik.simpleEvristikAlgorithm()

    println("--------------------------------------------------------")

    // Variant #2

    println("Variant #2")

    variant = arrayListOf(Point(-7.02, 2.94), Point(-5.77, 2.16), Point(-8.17, -1.19), Point(-2.42, -2.87),
        Point(-4.49, 0.76), Point(-4.54, -1.51), Point(0.26, -5.71), Point(-0.29, -7.21), Point(1.74, -7.8),
        Point(-1.84, -8.49), Point(1.01, -9.44), Point(-1.19, -5.76), Point(7.0, 0.33), Point(3.64, 0.05),
        Point(5.97, 0.42), Point(5.24, -1.99), Point(5.39, -3.97), Point(7.95, -3.17), Point(7.05, -1.7),
        Point(3.94, -2.25), Point(-0.64, 7.88), Point(-1.34, 9.17), Point(-2.57, 9.17), Point(-3.94, 7.74),
        Point(-1.04, 5.06), Point(-3.02, 5.52), Point(-1.87, 7.7), Point(7.7, 7.26), Point(5.52, 8.36),
        Point(4.52, 7.22), Point(4.87, 5.72), Point(7.15, 4.67), Point(6.82, 7.1), Point(6.15, 6.94), Point(6.65, 9.4))
    tVar = arrayListOf(3, 4, 6, 7, 8, 10)

    evristik = Evristik(FirstMetod.FIRST, variant)
    evristik.T = tVar
    evristik.simpleEvristikAlgorithm()

    println("--------------------------------------------------------")

    evristik = Evristik(FirstMetod.LAST, variant)
    evristik.T = tVar
    evristik.simpleEvristikAlgorithm()

    println("--------------------------------------------------------")

    evristik = Evristik(FirstMetod.RANDOM, variant)
    evristik.T = tVar
    evristik.simpleEvristikAlgorithm()

    println("--------------------------------------------------------")

    // Variant #3

    println("Variant #3")

    variant = arrayListOf(Point(6.98, 7.7), Point(4.7, 8.09), Point(5.57, 4.94), Point(8.48, 4.76), Point(5.86, 6.94),
        Point(-5.5, 8.36), Point(-6.31, 7.46), Point(-7.43, 5.45), Point(-2.71, 6.15), Point(-4.79, 6.79),
        Point(-5.64, 4.42), Point(-5.12, -2.97), Point(-7.32, -3.09), Point(-4.36, -4.94), Point(-5.86, -4.55),
        Point(-7.05, -5.76), Point(3.31, -2.18), Point(4.63, -2.37), Point(6.04, -3.73), Point(3.38, -4.52),
        Point(5.3, -6.19), Point(4.59, -4.15), Point(-6.35, 1.94), Point(-4.14, 4.84))
    tVar = arrayListOf(3, 4, 6, 7, 8, 10)

    evristik = Evristik(FirstMetod.FIRST, variant)
    evristik.T = tVar
    evristik.simpleEvristikAlgorithm()

    println("--------------------------------------------------------")

    evristik = Evristik(FirstMetod.LAST, variant)
    evristik.T = tVar
    evristik.simpleEvristikAlgorithm()

    println("--------------------------------------------------------")

    evristik = Evristik(FirstMetod.RANDOM, variant)
    evristik.T = tVar
    evristik.simpleEvristikAlgorithm()

    println("--------------------------------------------------------")


}