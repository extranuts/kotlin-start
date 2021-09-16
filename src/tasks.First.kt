fun main() {

    val m1 = listOf(1,2,3,2,0)

    val m2 = listOf(5,1,2,7,3,2)

    println(getRepeatedIntersection(m1, m2))

}

fun getRepeatedIntersection(m1: List<Int>, m2: List<Int>): List<Int> {
    val s1 = m1.toHashSet()
    val s2 = m2.toHashSet()

    val result = mutableListOf<Int>()

    for (element in s1) {
        if (s2.contains(element)) {
            val numOfRepeats = minOf(m1.count { it==element}, m2.count {it == element} )
            repeat(numOfRepeats) {result.add(element)}
        }
    }
    return result
}