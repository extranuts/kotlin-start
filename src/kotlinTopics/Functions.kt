package kotlinTopics

fun main() {
    println(testSimple())
    println(testSimple1())
    println(testSimple2(5, 5))
    println(testString(10))

    println(testNamedArgs(y = 6, x = 1, z = 7))

    println(testDefArgs(1, 2))

}

fun testSimple(): Int {
    return 5 + 5
}

fun testSimple1(): Int = 5 + 5

fun testSimple2(x: Int, y: Int): Int = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArgs(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

fun testDefArgs(x: Int = 1, y: Int = 2) {
    println(x + y)
}