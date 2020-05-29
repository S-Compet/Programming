package competitive.codeforces.Kotlin_Heroes_Practice_4

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    fun scanInt() = scanner.nextInt()

    var t = scanInt()
    while (t-- > 0) {
        val n = scanInt()

        val nStr = n.toString()
        val nLength = nStr.length

        val container = arrayListOf<String>()
        for (index in 0 until nLength) {
            val value = nStr[index]
            if (value - '0' != 0) {
                var ans = "" + value
                for (zeroIndex in index + 1 until nLength) {
                    ans += "0"
                }

                container.add(ans)
            }
        }

        println(container.size)
        for (value in container) {
            print("$value ")
        }
        println()
    }
}