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
    val n = arrayOf(1, 3, 4, 2, 2)
    val n1 = arrayOf(5, 1, 3, 4, 2, 3)
    // what I know: 5 must be the output
    val res = findDuplicate(n)
    println(res)

    val res1 = findDuplicate(n1)
    println(res1)
}