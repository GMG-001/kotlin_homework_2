fun main() {
    val point1 = Point(1,5)
    val point2 = Point(11,51)

    val symmetry = Point(15,16).reversePoint()
    val checkEquals = point1 == point2
    val testDistance = Point(11,51).distanceBetweenTwoPoints(point1)

    println("მოცემული წერტილის კოორდინატებია $point1")
    println(checkEquals)
    println("მოცემული წერტილის სათავის მიმართ სიმეტრიული წერტილის კოორდინატებია $symmetry")
    println(testDistance)


    aircraftFactoryTest()?.fly()
    carFactoryTest()?.drive()
}