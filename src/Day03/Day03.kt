package Day03

import java.io.File

data class Claim(val id: Int, val leftEdge: Int,val topEdge: Int,val width: Int, val height: Int)

private val claims = File("src/Day03/input.txt").readLines().map { it }
var fabric = Array(1000) { IntArray(1000) {0} }

fun part1():Int {
    claims.forEach { claim ->
        val claimObj = Claim(claim.substringBetween("#","@").trim().toInt(),claim.substringBetween("@",",").trim().toInt(),claim.substringBetween(",",":").trim().toInt(),
                claim.substringBetween(":","x").trim().toInt(),claim.substringBetween("x","L").trim().toInt())
        for (i in claimObj.leftEdge until claimObj.width + claimObj.leftEdge  ){
            for (j in claimObj.topEdge until claimObj.height + claimObj.topEdge){
                fabric[i][j]++
            }
        }

    }

    return fabric.forEach {
        it.map { it. }

    }
}

fun main(args : Array<String>) {

    print(part1())

    //println("Part 1: Checksum: ${part1()}")
    //println("Part 2: Repeated frequency: ${part2()}")

}

fun String.substringBetween(firstCharacter: String, secondCharacter: String): String{
    if (secondCharacter == "L"){
        return this.substring(this.indexOf(firstCharacter) + 1, this.length)
    }
    return this.substring(this.indexOf(firstCharacter) + 1, this.indexOf(secondCharacter))

}