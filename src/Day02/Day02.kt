package Day02

import java.io.File

private val ids = File("src/Day02/input.txt").readLines().map { it }
var twoTimes = 0
var threTimes = 0

fun part1(): Int{
    ids.forEach { word ->
        var repeatedCharacters = word.groupingBy { it }.eachCount()
        if (repeatedCharacters.filterValues { it == 2 }.isNotEmpty()) twoTimes++
        if (repeatedCharacters.filterValues { it == 3 }.isNotEmpty()) threTimes++

    }
    return twoTimes * threTimes
}

fun main(args : Array<String>) {

    println("Part 1: Checksum: ${part1()}")
    //println("Part 2: Repeated frequency: ${part2()}")

}