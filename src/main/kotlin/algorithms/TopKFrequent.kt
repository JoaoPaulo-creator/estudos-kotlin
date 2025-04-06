package algorithms

fun topKFrequent(arr: List<Int>, k: Int): MutableList<Int> {
    val frequencyMap: MutableMap<Int, Int> = mutableMapOf()

    for (num in arr) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }


    // "list comprehension in kotlin"
    val bucket = Array(arr.size + 1) { mutableListOf<Int>() }
    for ((n, v) in frequencyMap) {
        bucket[v].add(n)
    }

    val result = mutableListOf<Int>()

    for (freq in bucket.size - 1 downTo 1) {
        for (num in bucket[freq]) {
            result.add(num)
            if (result.size == k) {
                return result
            }
        }
    }


    return result
}


fun main() {
    val arr = listOf(1, 1, 1, 2, 2, 3)
    println(topKFrequent(arr, 2))
}