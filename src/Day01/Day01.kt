package Day01

import java.io.File

private val numbers = File("src/Day01/input.txt").readLines().asSequence().map { it.toInt() }

fun part1() = numbers.sum().toString()

fun part2(): Int {

    val frequencies: MutableSet<Int> = mutableSetOf(0)
    var frecuency = 0
    while (true) {
        numbers.forEach {
            frecuency += it
            if (!frequencies.add(frecuency)) return frecuency

        }
    }
}

    
    fun main(args : Array<String>) {

        println("Part 1: Last frequency: ${part1()}")
        println("Part 2: Repeated frequency: ${part2()}")

    }


