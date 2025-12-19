package com.github.he11pme.problem3

import kotlin.system.measureTimeMillis

private val tests = listOf(
    // Public tests
    Test(
        "Test 1",
        Input("1 4 9 16 25", "5", "2"),
        "24"
    ),
    Test(
        "Test 2",
        Input("1 2 3 6 8 25","4",  "5"),
        "31"
    ),

    // My tests
    Test(
        "My test 1",
        Input("1 100", "5", "2"),
        "99"
    ),
    Test(
        "My test 2",
        Input("1 50 99", "49", "2"),
        "98"
    )
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

data class Test(
    val title: String,
    val input: Input,
    val answer: String
)