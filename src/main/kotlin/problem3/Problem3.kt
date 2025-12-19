package com.github.he11pme.problem3

import kotlin.math.max
import kotlin.math.min

var answer: String = ""
    private set

fun main() {
    val input = readInput()
    start(input)
}

fun start(input: Input) {
    answer = getAnswer(solution(input))
    println(answer)
}

private fun readInput(): Input {
    val (_, t) = readln().split(" ")
    val floors = readln()
    val worker = readln()

    return Input(floors, t, worker)
}

private fun solution(input: Input): Int {

    val floors = input.floors.split(" ").map { it.toInt() }
    val worker = input.worker.toInt()
    val t = input.t.toInt()

    val down = floors[worker - 1] - floors.first()
    val up = floors.last() - floors[worker - 1]

    if (min(down, up) <= t) return floors.last() - floors.first()
    else return min(down, up) * 2 + max(down, up)

}

private fun getAnswer(answer: Int): String {
    return answer.toString()
}

data class Input(val floors: String, val t: String, val worker: String)