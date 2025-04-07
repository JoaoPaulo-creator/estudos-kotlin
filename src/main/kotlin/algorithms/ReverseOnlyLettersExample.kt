package algorithms

fun main() {
    val str = "ab-cd"
    // output must be dc-ba
    val t = str.toList()

    val arr = arrayOf("a", "b", "c", "d")
    var left = 0
    var right = arr.size - 1

    // working with swap
   /*
   * the best approach when talking about swapping positions in an array
   * is to use pointers (or indices).
   *
   * initially is necessary to create a tmp(temporary) variable, whose will receive
   * the value of the left pointer
   *
   * then, the array in the left position, will receive the value from the array
   * in the right position
   *
   * */
    while (left < arr.size - 1) {
        val tmp = arr[left]
        arr[left] = arr[right]
        arr[right] = tmp

        /*
        * here, it makes necessary to "walk" through the array
        *
        * so the left side needs to move to the right
        * and the right needs to move to left, until these two meet each other
        * */
        left++
        right--
    }

    println(arr.toList())

//    println(arr.joinToString(", "))
}