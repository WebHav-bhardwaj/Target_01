package Kotlin_01

class kotlin_first {

}

fun main(){
    println("Supp kotlin!")
    val tEmp = Employee("Employee", 22, true, "Bhopal");
    println("${tEmp.name} ${tEmp.age} ${tEmp.address}")

    val arr = arrayOf("dog", "cat", "bird")

    for((index, element) in arr.withIndex()){
        println("${index+1}) $element")
    }

    println("Sum and Product of 2 and 3 is ${sum(3,2)} and ${multiply(y = 3, x= 2)}")

    println("Bro" onto "Da");

    printAllWithPrefix("Vaibhav", "Shree", "Shikhar", prefix="Greetings")

    nullPointerException()

    val exmpcll = exampleClass().sayHello();
    val prt = parent().sayHello();
    val cld = child().sayHello();

//    if something is not defined it is Unit in kotlin
//    Unit = void in java
    val isUnit = println("Something")
    println(isUnit)

//    example of fun with default params
    drive()
    drive("Slow")
}

fun sum(x: Int, y:Int): Int{
    val res:Int = x.plus(y);
    return res;
}

fun multiply(x: Int,y: Int) = x*y

// Infix function
infix fun String.onto(other:String) = Pair(this,other);

//vararg
fun printAllWithPrefix(vararg messages: String, prefix: String){
    print("$prefix: ")
    for(m in messages) print("$m ")
    println()
}

fun nullPointerException(){
    var check: Int? = 2;
    check = null;
    println(check)
//     use !!(double bang) operator to throw exception if a var is null
//    it is usually used to check for example arr!!.length to check if arr != null
//    val ifCheck: Boolean = check!!
}

// Inheritance
class exampleClass{
    fun sayHello(){
        println("Hello Class")
    }
}

// to inherit add open
open class parent{
    open fun sayHello(){
        println("Hello parent")
    }
}

class child: parent(){
    override fun sayHello(){
        println("Hello child")
    }
}

// Default parameters ( again like js )
fun drive(Speed: String = "fast"){
    println(Speed);
}

