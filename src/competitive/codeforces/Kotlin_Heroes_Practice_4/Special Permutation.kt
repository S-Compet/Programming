package competitive.codeforces.Kotlin_Heroes_Practice_4

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    fun scanInt() = scanner.nextInt()

    var t = scanInt()
    while (t-- > 0) {
        val n = scanInt()

        if (n < 4) {
            println("-1")
        } else {
            val oddMid = (n + 1) / 2
            for (i in oddMid downTo 1) {
                print("" + (2 * i - 1) + " ")
            }

            print("4 2 ")

            val evenMid = n / 2
            for (i in 3..evenMid) {
                print("" + (2 * i) + " ")
            }
            println()
        }
    }
}