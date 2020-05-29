package competitive.codeforces.Kotlin_Heroes_Practice_4

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    fun scanInt() = scanner.nextInt()

    var t = scanInt()
    while (t-- > 0) {
        val n = scanInt()

        val container = arrayListOf<Int>()
        for (index in 1 .. n) {
            container.add(scanInt())
        }

        var leftIndex = 0
        var rightIndex = n - 1
        var aliceTotalSum = 0
        var bobTotalSum = 0
        var aliceLastSum = 0
        var bobLastSum = 0
        var aliceMove = 0
        var bobMove = 0
        while (leftIndex <= rightIndex) {
            var aliceCurrentSum = 0
            while (aliceCurrentSum <= bobLastSum && leftIndex <= rightIndex) {
                aliceCurrentSum += container[leftIndex++]
            }
            if (aliceCurrentSum > 0) {
                aliceLastSum = aliceCurrentSum
                aliceTotalSum += aliceCurrentSum

                aliceMove++
            }

            var bobCurrentSum = 0
            while (bobCurrentSum <= aliceLastSum && leftIndex <= rightIndex) {
                bobCurrentSum += container[rightIndex--]
            }
            if (bobCurrentSum > 0) {
                bobLastSum = bobCurrentSum
                bobTotalSum += bobCurrentSum

                bobMove++
            }
        }

        println("" + (aliceMove + bobMove) + " $aliceTotalSum $bobTotalSum")
    }
}