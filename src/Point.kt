import kotlin.math.sqrt

class Point(private val x: Int = 0, private val y: Int = 0){
    override fun toString(): String {
        val x = x.toString()
        val y = y.toString()
        return "$x $y"
    }

    override fun equals(other: Any?): Boolean {
       return (other is Point) && (this.x == other.x) && (this.y == other.y)
    }

    fun reversePoint(): Point{
        return Point(-x, -y)
    }

    fun distanceBetweenTwoPoints(point: Point): String {
        val distance = sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y).toDouble())

        return "მანძილი ორ წერტილს შორის არის: $distance"
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }

}