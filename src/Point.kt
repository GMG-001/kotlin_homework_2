import kotlin.math.sqrt

data class Point(private val x: Int, private val y: Int){
    override fun toString(): String {
        val x = x.toString()
        val y = y.toString()
        return "$x $y"
    }

    fun equals(point: Point): Boolean {
        return this.x == point.x && this.y == point.y
    }

    fun reversePoint(): Point{
        return Point(-x, -y)
    }

    fun distanceTwoPoints(point: Point): Double {
        val distance = (point.x-this.x)*(point.x-this.x)+(point.y-this.y)*(point.y-this.y)

        return sqrt(distance.toDouble())
    }

}