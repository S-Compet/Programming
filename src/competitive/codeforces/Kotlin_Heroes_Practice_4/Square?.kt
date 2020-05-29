package competitive.codeforces.Kotlin_Heroes_Practice_4

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    fun scanInt() = scanner.nextInt()

    var t = scanInt()
    while (t-- > 0) {
        var a1 = scanInt()
        var b1 = scanInt()
        if (a1 > b1) {
            val temp = a1
            a1 = b1
            b1 = temp
        }

        var a2 = scanInt()
        var b2 = scanInt()
        if (a2 > b2) {
            val temp = a2
            a2 = b2
            b2 = temp
        }

        val output = if (b1 == b2 && a1 + a2 == b1) "Yes" else "No"
        println(output)
    }
}