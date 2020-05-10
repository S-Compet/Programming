package competitive.codechef.YEAR2020.MayLong

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    fun scanInt() = scanner.nextInt()

    fun isSorted(container: ArrayList<Int>): Boolean {
        var returnValue = true

        for (index in 1 until container.size) {
            if (container[index] < container[index - 1]) {
                returnValue = false
                break
            }
        }

        return returnValue
    }

    var t = scanInt()
    while (t-- > 0) {
        var n = scanInt()
        val k = scanInt()

        val container = arrayListOf<Int>()
        while (n-- > 0) {
            container.add(scanInt())
        }

        if (isSorted(container)) {
            println("0")
            continue
        }

        val unSortedContainer = arrayListOf<Int>()
        val unSortedIndexContainer = arrayListOf<Int>()
        for (index in 0 until container.size) {
            if (index + 1 != container[index]) {
                unSortedContainer.add(container[index])
                unSortedIndexContainer.add(index + 1)
            }
        }

        var isPossible = true
        val stepsContainer = arrayListOf<String>()

        if (unSortedContainer.size == 0) {
            // do nothing
        } else if (unSortedContainer.size < 3) {
            isPossible = false
        } else {
            for (currentPos in 0 until unSortedContainer.size - 2) {
                var smallestNoPos = currentPos
                for (index in currentPos + 1 until unSortedContainer.size) {
                    if (unSortedContainer[index] < unSortedContainer[smallestNoPos]) {
                        smallestNoPos = index
                    }
                }

                if (currentPos == smallestNoPos) continue

                val secondSmallestNoPos: Int
                if (smallestNoPos - currentPos > 1) {
                    secondSmallestNoPos = currentPos + 1
                } else {
                    secondSmallestNoPos = smallestNoPos + 1
                }

                if (secondSmallestNoPos < smallestNoPos) {
                    val step = "" +
                            unSortedIndexContainer[currentPos] + " " +
                            unSortedIndexContainer[secondSmallestNoPos] + " " +
                            unSortedIndexContainer[smallestNoPos]
                    stepsContainer.add(step)

                    val a = unSortedContainer[currentPos]
                    val b = unSortedContainer[secondSmallestNoPos]
                    val c = unSortedContainer[smallestNoPos]
                    unSortedContainer[currentPos] = c
                    unSortedContainer[secondSmallestNoPos] = b
                    unSortedContainer[smallestNoPos] = a
                } else if (secondSmallestNoPos > smallestNoPos) {
                    val step = "" +
                            unSortedIndexContainer[currentPos] + " " +
                            unSortedIndexContainer[smallestNoPos] + " " +
                            unSortedIndexContainer[secondSmallestNoPos]
                    stepsContainer.add(step)
                    stepsContainer.add(step)

                    val a = unSortedContainer[currentPos]
                    val b = unSortedContainer[smallestNoPos]
                    val c = unSortedContainer[secondSmallestNoPos]
                    unSortedContainer[currentPos] = b
                    unSortedContainer[smallestNoPos] = c
                    unSortedContainer[secondSmallestNoPos] = a
                }

                if (stepsContainer.size > k) {
                    isPossible = false
                    break
                } else if (isSorted(unSortedContainer)) {
                    break
                }
            }
        }

        if (isPossible) {
            println(stepsContainer.size)
            for (index in 0 until stepsContainer.size) {
                val step = stepsContainer[index]
                println(step)
            }
        } else {
            println("-1")
        }
    }
}