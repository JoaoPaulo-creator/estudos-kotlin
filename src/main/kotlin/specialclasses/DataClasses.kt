package specialclasses

data class CarParts(
    val id: String? = null,
    val name: String,
    val price: Float,
    val description: String
) {}

fun main() {
    val p = listOf<CarParts>(
        CarParts(name = "Manopla câmbio", price = 50f, description = "manopla univerval"),
        CarParts(name = "Roda Berlim", price = 6000.00f, description =  "roda que deixa o carro show"),
        CarParts(name = "Parabrisa Focus mk3", price = 4500f, description =  "parabrisa para focus mk3"),
        CarParts(name = "Pneu michelin", price = 2200f, description =  "pneu"),
        CarParts(name = "Câmbio Powershift", price = 5812.04f, description =  "pneu"),
    )

    val filteredCarParts = p.filter { i -> i.price >= 2000f }
    val mappedCarParts = filteredCarParts.map{ i -> object {
        val name: String = i.name
        val price: Float = i.price
    } }

    for (i in 0 until mappedCarParts.size ) {
        println(mappedCarParts[i as Int].name)
        println(mappedCarParts[i as Int].price)
    }
}
