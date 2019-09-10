fun main() {
    val a = 5
    when (a) {
        1, 2 -> print("1 2")
        3, 4 -> print("3 4")
        else -> print("5")
    }

    when {
        a % 2 == 0 -> print("Evem")
        a % 2 != 0 -> print("ODd")
        else -> print("Invalid")
    }
}