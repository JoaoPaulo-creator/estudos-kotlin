import algorithms.twoSum
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestTwoSum {

    @Test
    fun `test the sum of two element in an array`(){
        val arr = mutableListOf<Int>(2, 3, 4, 1, 7)
        val target = 9
        val expected = mutableListOf(2, 7)
        assertEquals(expected, twoSum(arr, target))
    }
}