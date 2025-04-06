package algorithms

fun twoSum(arr: MutableList<Int>, target: Int): MutableList<Int> {
    arr.sort()
    println(arr)

    var left = 0
    var right = arr.size - 1

    while (left < arr.size) {
        val sum = arr[left]  + arr[right]

        if (sum == target) {
            return mutableListOf(arr[left], arr[right])
        }
        else if(sum < target) {
            println("left: ${arr[left]}")
            left++
        } else {
            println("right: ${arr[right]}")
            right--
        }
    }

    return mutableListOf(0, 0)
}


fun main() {
    val arr = mutableListOf(1, 2, 7, 8, 11, -2, 3, 9, 5)
    val target = 13
    println(twoSum(arr, 13))
}