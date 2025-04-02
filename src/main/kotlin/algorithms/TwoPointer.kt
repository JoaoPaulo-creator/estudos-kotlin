package algorithms

class TwoPointer {
    fun reverseWord(s: String): String {
        var res = ""
        var l = 0
        var r = 0

        while (r < s.length) {
            if (s[r] != ' ') {
                r += 1
            } else {
                res += s.substring(l, r).reversed() + " "
                r += 1
                l = r
            }
        }

        if (l < s.length) {
            res += s.substring(l, r).reversed()
        } else if (res.isNotEmpty()) {
            res = res.substring(0, res.length - 1) + " "
        }

        return res
    }
}

fun main() {
    val tp = TwoPointer()
    val str = "Isso eh um teste"

    println(tp.reverseWord(str))
}
