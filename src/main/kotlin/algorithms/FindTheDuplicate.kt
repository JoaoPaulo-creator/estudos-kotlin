package algorithms

fun findDuplicate(arr: Array<Int>): Int {
    // walk through the array
    // identify who is duplicated
    val n: MutableSet<Int> = mutableSetOf()

    for (i in arr.indices) {
       if(!n.add(arr[i]))  {
           return arr[i]
       }
    }

    return -1
}

fun main() {
    val n = arrayOf(1, 5, 3, 9, 2, 5, 7)
    // what I know: 5 must be the output
    val res = findDuplicate(n)
    println(res)
}