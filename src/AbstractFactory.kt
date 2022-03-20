fun aircraftFactoryTest(): Aircraft? {
    val aircraft = arrayOf("Boeing737", "Boeing777")

    return AircraftFactory().create(aircraft.random())
}

fun carFactoryTest(): Car? {
    val car = arrayOf("Audi", "Maserati")

    return CarFactory().create(car.random())
}