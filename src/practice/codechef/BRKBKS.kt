package practice.codechef

import java.lang.Math.ceil
import java.util.*

fun main() {
    try {
        val scanner = Scanner(System.`in`)
        var t = scanner.nextInt()

        while (t > 0) {
            t--

            val sum = scanner.nextInt() + scanner.nextInt() + scanner.nextInt()
            val output = ceil(sum * 1.0 / 3)
            println(output.toInt())
        }
    } catch (ex: Exception) {

    }
}