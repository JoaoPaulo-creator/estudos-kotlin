package controlflow

class ConditionalExpression {
    companion object CE {
        // similar to ternary operatorion
        fun max(a: Int, b: Int) = if (a > b) true else false
    }
}

fun main() {
    println("is a greater than b? : ${ConditionalExpression.CE.max(99, -42)}")
}