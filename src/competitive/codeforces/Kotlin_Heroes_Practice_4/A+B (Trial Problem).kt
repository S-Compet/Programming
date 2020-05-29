package competitive.codeforces.Kotlin_Heroes_Practice_4

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    fun scanInt() = scanner.nextInt()

    var t = scanInt()

    while (t-- > 0) {
        val a = scanInt()
        val b = scanInt()
        println(a + b)
    }
}