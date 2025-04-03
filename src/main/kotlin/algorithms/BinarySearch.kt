package algorithms

fun binarySearch(arr: Array<Int>, n: Int): Int {
    var low = 0
    var high = arr.size - 1
    var steps = 0

    while(low < high) {
        steps++
        val mid = (low+high) / 2

        if(arr[mid] == n) {
            println("steps: $steps")
            return mid
        } else if(arr[mid] < n) {
            low = mid + 1
        } else {
            high = mid
        }
    }

    return - 1
}


fun main() {
    val n = arrayOf(1, 2, 3, 4, 5, 7, 9, 10, 11)
    println(binarySearch(n,7))
}