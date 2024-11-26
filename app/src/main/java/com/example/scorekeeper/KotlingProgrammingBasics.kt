package com.example.scorekeeper

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Taking input for hardness, tensile strength, and carbon content
    println("Enter the hardness of the steel:")
    val hardness = scanner.nextDouble()

    println("Enter the tensile strength of the steel:")
    val tensileStrength = scanner.nextInt()

    println("Enter the carbon content of the steel:")
    val carbonContent = scanner.nextDouble()

    // Checking the conditions
    val condition1 = hardness > 50
    val condition2 = tensileStrength < 5600
    val condition3 = carbonContent >= 0.7

    println("condition1: $condition1")
    println("condition2: $condition2")
    println("condition3: $condition3")
    // Assigning grade based on conditions
    val grade = when {
        condition1 && condition2 && condition3 -> 10
        condition1 && condition2 -> 9
        condition2 && condition3 -> 8
        condition1 && condition3 -> 7
        condition1 || condition2 || condition3 -> 6
        else -> 5
    }

    println("The grade of the steel is: $grade")
}
