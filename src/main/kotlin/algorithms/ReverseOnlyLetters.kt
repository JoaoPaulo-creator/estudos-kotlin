package algorithms

fun reverseOnlyLetter(str: String): String {
    var strToList = str.toMutableList()

    var left = 0
    var right = strToList.size - 1

    while (left < right) {
        if (!strToList[left].isLetter()) {
            left++
        } else if (!strToList[right].isLetter()) {
            right--
        } else {
            val tmp = strToList[left]
            strToList[left] = strToList[right]
            strToList[right] = tmp

            left++
            right--
        }
    }

    return strToList.joinToString("")
}

fun main() {
    val str = "--ab-c-d"
    println(reverseOnlyLetter(str))

    val str2 = "a-bC-dEf-ghIj"
    println(reverseOnlyLetter(str2))

    val str3 = "Test1ng-Leet=code-Q!"
    println(reverseOnlyLetter(str3))
}