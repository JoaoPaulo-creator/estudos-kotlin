package algorithms

//FIX: arrumar depois
fun main() {
    val board: Array<Array<String>> = arrayOf(
        arrayOf("A", "O", "D"),
        arrayOf("T", "G", "S"),
        arrayOf("X", "C", "R"),
        arrayOf("R", "A", "E"),
    )
    val dog = "DOG"
    val taog = "TAO"
    val rear = "RED"

    println(exists(board, dog))
    println(exists(board, taog))
    println(exists(board, rear))
}

fun exists(board: Array<Array<String>>, word: String): Boolean {
    val nRows = board.size
    val nCols = board[0].size

    for (row in 0 until nRows) {
        for(col in 0 until nCols) {
            if (backtrack(board, nRows, nCols, row, col, word)) {
                return true
            }
        }
    }

    return false
}

fun backtrack(board: Array<Array<String>>, nRows: Int, nCols: Int, row: Int, col: Int, suffix: String): Boolean {
    if (suffix.isEmpty()) {
        return true
    }


    val result = when {
        row < 0 -> false
        row >= nRows -> false
        col < 0 -> false
        col >= nCols -> false
        board[row][col] != suffix.substring(startIndex = 0) -> false
        else -> true
    }

    if (row < 0 || row >= nRows) {
        return false
    }

    val originalChar = board[row][col]
    board[row][col] = "#"

    val directions: Array<IntArray>  = arrayOf(
        intArrayOf(0, 1),
        intArrayOf(1, 0),
        intArrayOf(-1, 0),
        intArrayOf(0, -1),
    )

    for (i in directions) {
        val newRow = row + i[0]
        val newCol = col + i[1]
        if(backtrack(board, nRows, nCols, newRow, newCol, suffix.substring(startIndex = 1))) {
           return true
        }
    }


    board[row][col] = originalChar
    return result
}
