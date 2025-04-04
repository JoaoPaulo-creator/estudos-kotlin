package algorithms

// walk through the array
// check how many times an element appears in it
// divide the size of the array by the floor rounded result
// the output must be the element that appeared the most
fun majorityElement(arr: IntArray): Int {
    val arrSize = arr.size
    val nMap: MutableMap<Int, Int> = mutableMapOf<Int, Int>()

    for(i in arr) {
        nMap[i] = nMap.getOrDefault(i, 0) + 1
    }

    val r = arrSize/ 2
    for((k, v) in nMap) {
        if(r < v) {
            return k
        }
    }

    return -1
}

fun main() {
    val arr = intArrayOf(3, 3, 4, 2, 3, 3, 3)
    println(majorityElement(arr))

    val arr2 = intArrayOf(1, 1, 2, 2, 2, 2)
    println(majorityElement(arr2))
}