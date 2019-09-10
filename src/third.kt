fun main()
{
    isEven(b=20)
}
fun isEven(a: Int = 5, b: Int = 2)
{
    if (a%2 == 0)
    {
        if (b%2 == 0)
           return
        println("Even")
    }
    else
    {
        if (b%2 != 0)
            return
        println("Odd")
    }
}
