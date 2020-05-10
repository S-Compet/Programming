package competitive.codechef.YEAR2020.MayLong

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    fun scanInt() = scanner.nextInt()

    var t = scanInt()
    while (t-- > 0) {
        var n = scanInt()

        val container = arrayListOf<Int>()
        while (n-- > 0) {
            container.add(scanInt())
        }

        /** sort the array */
        container.sort()

        var globalMax = 1
        var globalMin = Int.MAX_VALUE
        var continuousGroupCount = 1
        for (index in 1 until container.size) {
            val olderPosition = container[index - 1]
            val currentPosition = container[index]

            if (currentPosition - olderPosition <= 2) {
                continuousGroupCount++
            } else {
                globalMax = globalMax.coerceAtLeast(continuousGroupCount)
                globalMin = globalMin.coerceAtMost(continuousGroupCount)

                continuousGroupCount = 1
            }
        }
        globalMax = globalMax.coerceAtLeast(continuousGroupCount)
        globalMin = globalMin.coerceAtMost(continuousGroupCount)

        println("$globalMin $globalMax")
    }
}