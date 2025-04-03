package algorithms

// I didn't solve this, was a.i
fun subarraySum(arr: IntArray, k: Int): Int {
    var count = 0
    var prefixSum = 0
    val sumMap = mutableMapOf<Int, Int>()

    // Initialize with sum 0 (to handle subarrays that start from index 0)
    sumMap[0] = 1

    for (num in arr) {
        prefixSum += num

        // Check if (prefixSum - k) exists in the map
        if (sumMap.containsKey(prefixSum - k)) {
            count += sumMap[prefixSum - k]!!
        }

        // Store the prefix sum count in the map
        sumMap[prefixSum] = sumMap.getOrDefault(prefixSum, 0) + 1
    }

    return count
}

fun main() {
    val arr = intArrayOf(3, 4, 7, 2, -3, 1, 4, 2)
    val k = 7
    println(subarraySum(arr, k)) // Output: 4
}
