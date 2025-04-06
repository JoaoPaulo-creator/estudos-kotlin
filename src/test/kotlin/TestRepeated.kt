import algorithms.findDuplicate
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestRepeated {

    private val set: MutableSet<Int> = mutableSetOf()

    @Test
    fun `find the duplicate in an array`() {
        val arr = arrayOf(2, 1, 8, 7, 2)
        val target = 2
        val actual = findDuplicate(arr)

        assertEquals(2, actual)
    }

    private data class Duplicate(val element:Int) {}
    private fun Duplicate.findDuplicate(arr: IntArray): Int {
        for (i in arr.indices)   {
            if (!set.add(arr[i])) {
                return arr[i]
            }
        }

        return -1
    }
}

