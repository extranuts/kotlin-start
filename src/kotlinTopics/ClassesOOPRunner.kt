package kotlinTopics

import java.beans.beancontext.BeanContextChild

fun main() {
    val child = Person("Child", "Children",1)
    val p1 = Person("Tom", "Jones", 45)
    val p2 = Person("Tim",  "Reno", 34, child)
    println(p1.firstName)
    println(p2.children +" age: " + p2.age)
}
//PrimaryConstructor
class Person(val firstName: String, val lastName: String, var age:Int) {
    var children: MutableList<Person> = mutableListOf() //ArrayList

    //initialization block
    init{
        println("Person is created ----$firstName")
    }

    //second constructor
    constructor(firstName: String,lastName: String,age: Int,child: Person)
            :this(firstName,lastName,age){
                children.add(child)
            }
    //no args constructor
    constructor():this("","",-1)
}

