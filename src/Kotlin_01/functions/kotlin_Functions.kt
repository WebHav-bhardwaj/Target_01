package Kotlin_01.functions

class kotlin_Functions {
}

fun main(){
    val findin = findInList();
    println(findin("McDonald's"))

    val num = listOf(1,2,3);
}

fun findInList():(String) -> String {
    return ::encodeMsg
}

fun encodeMsg (str: String):String{
    return str.uppercase();
}

