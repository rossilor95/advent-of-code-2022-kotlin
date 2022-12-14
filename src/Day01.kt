import java.io.File

fun main() {
    fun parseInput(input: String): List<Int> = input.split("\n\n").map { elf ->
        elf.lines().map { calory -> calory.toInt() }
    }.map { it.sum() }

    fun sumTopCalories(calories: List<Int>, top: Int) =
        calories.sortedDescending().take(top).sum()

    fun part1(input: String): Int {
        val data = parseInput(input)
        return sumTopCalories(data, 1)
    }

    fun part2(input: String): Int {
        val data = parseInput(input)
        return sumTopCalories(data, 3)
    }

    val testInput = File("src/Day01_test.txt").readText()
    val input = File("src/Day01.txt").readText()

    check(part1(testInput) == 24000)
    println("Part 1 Answer: ${part1(input)}")

    check(part2(testInput) == 45000)
    println("Part 2 Answer: ${part2(input)}")
}
