fun main() {
    val t = Point(1,5)
    val t1 = Point(11,51)

    val t2_1 = Point(15,16).reversePoint()
    val t2_2 = Point(11,51).equals(t1)
    val t2_3 = Point(11,51).distanceTwoPoints(t)

    println(t)
    println(t2_1)
    println(t2_2)
    println(t2_3)


    aircraftFactoryTest()?.fly()
    carFactoryTest()?.drive()
}