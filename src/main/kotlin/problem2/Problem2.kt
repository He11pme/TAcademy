package com.github.he11pme.problem2

import kotlin.math.ceil
import kotlin.math.log

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
    val n = readln()

    return Input(n)
}

private fun solution(input: Input): Int {

    val n = input.n.toDouble()
    val result = ceil(log(n, 2.0)).toInt()

    return result
}

private fun getAnswer(answer: Int): String {
    return answer.toString()
}

data class Input(val n: String)