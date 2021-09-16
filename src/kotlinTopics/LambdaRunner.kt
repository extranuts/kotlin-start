package kotlinTopics


fun main() {
    val a = listOf(1, 2, 3, 4, 5, 6)

    a.forEach { e -> println(e) }
    println(a.map { e -> e * 2 })
    println(a.filter { e -> e % 2 == 0 })
    println(a.reduce { sum, e -> sum + e })


    println(a.sortedByDescending { it })

    println(a.singleOrNull { e -> e % 3 == 0 })

    println(a.all { it < 10 })

    println(a.any { it > 10 })
    a.sum()

    val numbers = listOf(1, 3, -4, 2, -100)
    val(positive, negative) = numbers.partition { it > 0 }

    println(positive)
    println(negative)

    val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length }

    println(result) //HashMap or LinkedHashMap



}