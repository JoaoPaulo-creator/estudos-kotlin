package scopefunctions

import java.util.*

class Let {
    fun customPrint(s: String) {
        println(s.uppercase(Locale.getDefault()))
    }
}


fun main() {
    val it_ = Let()
    val empty = "test".let {
        it_.customPrint(it) //it referencia "test"/string que está extendendo let
        it.isEmpty()
    }

    println("is empty?: $empty")

    printNonNull(null, it_)
    printNonNull("minha string", it_)
    printIfBothNonNull("primeira string", "segunda string", it_)
}

private fun printNonNull(str: String?, l: Let) {
    println("Printing: $str")

    str?.let {
        print("\t")
        l.customPrint(it)
        println()
    }
}

private fun printIfBothNonNull(strOne: String?, strTwo: String?, l: Let) {
    strOne?.let { firstString ->
        {
            strTwo?.let { secondString ->
                l.customPrint("$firstString | $secondString")
                println()
            }
        }
    }
}
