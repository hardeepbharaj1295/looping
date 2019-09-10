fun main() {
    val a = isEven(10)
    if (a){
        println("Even")
    }
    else{
        println("Odd")
    }
}

fun isEven(n: Int): Boolean
{
    return n%2 == 0
}