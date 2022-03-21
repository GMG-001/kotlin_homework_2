import kotlin.math.sqrt

class Point(private val x: Int, private val y: Int){
    override fun toString(): String {
        val x = x.toString()
        val y = y.toString()
        return "$x $y"
    }

    fun equals(point: Point): String {
        return if (this.x == point.x && this.y == point.y){
            ("მოცემული წერტილები ტოლია")
        }else{
            ("მოცემული წერტილები განსხვავებულია")
        }
    }

    fun reversePoint(): Point{
        return Point(-x, -y)
    }

    fun distanceBetweenTwoPoints(point: Point): String {
        val distance = sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y).toDouble())

        return "მანძილი ორ წერტილს შორის არის: $distance"
    }

}