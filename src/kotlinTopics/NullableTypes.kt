package kotlinTopics



fun main(){

    var a = "Hello"
    //a = null // whf??
    var b: String? = "test2"
    b = null

    b?.length // need safe call

    b?.length // safe call works -> ***return null****, not NPE if value length is not exists

//    bob?.departmernt?.head?.name -> null

    //Elvis operator aka if else use

    var length = b?.length ?: -1

    b = if((0..10).random()>5) "asfafafsaf" else null

    //!! looks like safe call, but ***throw NPE*** if value not exists
    val t = b!!.length


}