package competitive.codechef.YEAR2020.MayLong

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    fun scanInt() = scanner.nextInt()
    fun scanString() = scanner.next()

    var t = scanInt()
    while (t-- > 0) {
        var n = scanInt()
        var q = scanInt()
        val s = scanString()

        val map = HashMap<Char, Int>()
        for (ch in s) {
            if (map.containsKey(ch)) {
                val count = map[ch]!!
                map[ch] = (count + 1)
            } else {
                map[ch] = 1
            }
        }

        while (q-- > 0) {
            val c = scanInt()
            var globalQueuedPeopleCount = 0
            for (entry in map) {
                val queuedPeopleCount = entry.value - c
                 if (queuedPeopleCount > 0) {
                     globalQueuedPeopleCount += queuedPeopleCount
                 }
            }
            println(globalQueuedPeopleCount)
        }
    }
}