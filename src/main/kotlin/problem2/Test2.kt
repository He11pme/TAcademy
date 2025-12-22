package com.github.he11pme.problem2

import kotlin.math.pow
import kotlin.system.measureTimeMillis

private val tests = listOf(
    // Public tests
    Test(
        "Test 1",
        Input("6"),
        "3"
    ),
    Test(
        "Test 2",
        Input("5"),
        "3"
    ),

    // My tests
    Test(
        "My test 1",
        Input("7"),
        "3"
    ),

    createLongTest()
)

fun main() {

    tests.forEach { startWithTime(it) }

}

private fun startWithTime(test: Test) {
    println("start ${test.title}")
    val time = measureTimeMillis { start(test.input) }
    println("answer is ${if (answer == test.answer) "correct" else "incorrect"}!")
    println("${test.title}: lead time = $time ms")
    println()
}

private fun createLongTest(): Test {
    val n = 2 * 10.0.pow(9).toInt()
    return Test(
        title = "LOOONG TEST",
        input = Input(n.toString()),
        answer = "I don't know"
    )
}

data class Test(
    val title: String,
    val input: Input,
    val answer: String
)