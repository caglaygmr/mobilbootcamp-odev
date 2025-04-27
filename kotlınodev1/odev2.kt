fun main() {
    println("Celsius to Fahrenheit: " + celsiusToFahrenheit(25.0))
    println("Rectangle Perimeter: " + rectanglePerimeter(5.0, 10.0))
    println("Factorial: " + factorial(5))
    println("Count of 'a' letters: " + countLetterA("Ankara"))
    println("Interior Angles Sum: " + calculateInteriorAngles(6))
    println("Salary Calculation: " + calculateSalary(25))
    println("Quota Price: " + calculateQuotaPrice(60))
}


fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}


fun rectanglePerimeter(shortSide: Double, longSide: Double): Double {
    return 2 * (shortSide + longSide)
}


fun factorial(number: Int): Int {
    var result = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}


fun countLetterA(word: String): Int {
    return word.count { it == 'a' || it == 'A' }
}


fun calculateInteriorAngles(sides: Int): Int {
    return (sides - 2) * 180
}


fun calculateSalary(days: Int): Int {
    val workingHours = days * 8
    return if (workingHours <= 160) {
        workingHours * 10
    } else {
        (160 * 10) + ((workingHours - 160) * 20)
    }
}


fun calculateQuotaPrice(quota: Int): Int {
    return if (quota <= 50) {
        100
    } else {
        100 + (quota - 50) * 4
    }
}
