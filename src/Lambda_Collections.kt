fun main() {
    // part 1
    println("Part 1");
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println("[*] ${nums.map {it * 2}}");

    // part 2
    println("\nPart 2");
    val names = mutableListOf<String>("Alice", "Bob", "Amir", "Charlie", "Annie", "David");
    println("[*] ${filterNames(names) { it.contains("A" )}}");

}

fun filterNames( names: MutableList<String>, filter: (String) -> Boolean ): List<String>{
    return names.filter(filter);
}
