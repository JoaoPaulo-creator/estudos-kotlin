package algorithms

import kotlin.math.max

fun longestSequence(nums: List<Int>): Int {
    val numSet: Set<Int> = nums.toSet()

    // this will be the output value
    var longestStreak = 0

    for (n in nums) {
        if (n - 1 !in numSet) {
            var currentStreak = 1
            var currentNumber = n

            while (currentNumber + 1 in numSet)  {
                currentStreak++
                currentNumber++
            }

            longestStreak = max(currentStreak, longestStreak)
        }
    }

    return longestStreak
}


fun main() {
    // output must be 4
    val arr = listOf(100, 4, 200, 1, 2, 3)
    println(longestSequence(arr))
}