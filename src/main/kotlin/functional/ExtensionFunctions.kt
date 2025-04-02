package functional

data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)

fun Order.mappingProductsByPrice(): List<*> = this.items.map { it -> it.price }

fun main() {
    val orders = Order(
        listOf<Item>(
            Item("tv", 50f),
            Item("videogame", 500f),
            Item("universal tv controller", 9.90f),
        )
    )

//    println(orders.mappingProductsByPrice())
    sortSomething()
}

fun sortSomething() {
    val n: List<Int> = mutableListOf(2, -1, -25, 3, 1, 9, 10, 2)
    val sortBy = n.sortedBy { it -> it.inc() }

    println(sortBy)
}
