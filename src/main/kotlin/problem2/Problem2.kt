package com.github.he11pme.problem2

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

    var n = input.n.toInt()
    var result = 0

    while (n > 1) {
        result += n % 2 + 1
        n /= 2
    }

    return result
}

private fun getAnswer(answer: Int): String {
    return answer.toString()
}

data class Input(val n: String)