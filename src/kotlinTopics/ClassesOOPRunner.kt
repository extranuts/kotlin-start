package kotlinTopics

fun main() {
    val child = Person("Child", "Children", 1)
    val p1 = Person("Tom", "Jones", 45)
    val p2 = Person("Tim", "Reno", 34, child)
    println(p1.firstName)
    println(p2.children + " age: " + p2.age)
//--------------------------------------------------------------------------------


    val rectangle1 = Rectangle(4.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(4.0, 2.0)
    println(rectangle1==rectangle2) //true


}

//PrimaryConstructor
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() //ArrayList

    //initialization block
    init {
        println("Person is created ----$firstName")
    }

    //second constructor
    constructor(firstName: String, lastName: String, age: Int, child: Person)
            : this(firstName, lastName, age) {
        children.add(child)
    }

    //no args constructor
    constructor() : this("", "", -1)
}

//Equals hashCode toString ... == data class

data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 //this to field
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length
}
