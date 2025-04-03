import kotlin.test.Test

class Subarray {
    @Test
    fun t() {
        val arr = listOf(1, 2, 3, 4, 5)

        // Creating subarrays (sublists)
        val sub1 = arr.subList(1, 4)  // [2, 3, 4] -> elements from index 1 to 3
        val sub2 = arr.subList(0, 3)  // [1, 2, 3] -> elements from index 0 to 2
        val sub3 = arr.subList(2, arr.size)  // [3, 4, 5] -> from index 2 to end

        // Printing subarrays
        println("Original list: $arr")
        println("Sublist 1: $sub1")
        println("Sublist 2: $sub2")
        println("Sublist 3: $sub3")
    }
}