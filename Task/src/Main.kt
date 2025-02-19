fun main() {
    var age: Int = 25
    //age = null
    println("Age: $age")


    var city: String? = "New York"
    println("City: $city")
    city = null
    println("The city after null: $city")

    val cityLength: Int? = city?.length
    println("City length: $cityLength")

    val citySize = city?.length ?: 0
    println(citySize)

    fun evaluateScore(score: Double?): String {
        val validScore = score ?: 0.0
        return "Score: $validScore"
    }
    println(evaluateScore(85.5))
    println(evaluateScore(null))
}