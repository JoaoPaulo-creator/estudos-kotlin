package algorithms

// walk through array
// maybe check if the current arr[i] is greater or not compared to the missing natural number
fun foundMissing(arr: Array<Int>): Int {
    val n = arr.size
    var i = 0
    while (i < n) {
        val correctedIdx = arr[i] - 1
        if(arr[i] in 1..n && arr[i] != arr[correctedIdx]) {
           arr[i] = arr[correctedIdx].also { arr[correctedIdx] = arr[i] }
        } else {
            i++
        }
    }

    for (j in arr.indices) {
        if (arr[j] != j + 1) {
            return j + 1
        }
    }

    return n + 1
}

fun main() {
    val arr = arrayOf(3, 4, -1, 1)
    // output must be 2
    println(foundMissing(arr))

    val arr2 = arrayOf(1,2,0)
    // output must be 3
    println(foundMissing(arr2))
}
