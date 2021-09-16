package kotlinTopics


fun main(){
    testWhen(1)
    testWhen("Hello")
    testWhen(15)
}

//testWhen(Object object)
/**
 * public void test(Object input) {
 *     if(input instanceof String) {
 *         String strInput = (String) input;
 *         }
 *     if (input instanceof Integer) {.....}
 */
fun testWhen(input: Any){
    when(input){
        1-> println("One")
        2-> println("TWO")
        in 10..20 -> println("From 10 To 20")
        is String-> println("String length ${input.length}")
        else -> println("other input")
    }

}
