package controlflow
class MyClass  {}

class WhenClass {
        fun whenStatement(obj: Any) {
            when(obj) {
                1 -> println("One")
                "Hello" -> println("Greeting")
                is Long -> println("Long")
                !is String -> println("is not a string")
                else -> println("Unknown")
            }
        }

        // when expression
        fun whenAssign(obj: Any): Any {
            val result: Any = when(obj) {
                1 -> "one"
                "Hello" -> 1
                is Long -> false
                else -> 42
            }

            return result
        }
}

fun main() {
    val wc = WhenClass()

    wc.whenStatement("Hello")
    wc.whenStatement(1)
    wc.whenStatement(1L)
    wc.whenStatement(MyClass())
    wc.whenStatement("hello")

    println('\n')

    println("when expression: ${wc.whenAssign("Hello")}")
    println("when expression: ${wc.whenAssign(3.4)}")
    println("when expression: ${wc.whenAssign(1)}")
    println("when expression: ${wc.whenAssign(::MyClass)}")
}
