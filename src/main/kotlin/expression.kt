fun main() {
    println("Enter your age:")
    var age = readLine()?.toIntOrNull() ?: 0
    if (age == 0) {
        age = 1
    }

    val result = if (age in 1..12) {
        "a child"
    } else if (age in 13..17) {
        "a teen"
    } else {
        "an adult"
    }

    println("You are $result.")
}