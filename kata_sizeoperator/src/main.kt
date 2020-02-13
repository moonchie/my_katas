fun main(vararg args: String) {
    if(args.size < 3) {
        return showHelp()
    }

    val operators = mapOf(
            "+" to ::plus,
            "-" to ::minus,
            "*" to ::times,
            '/' to ::devide
    )

    val op = args[1]
    val opFunc = operators[op] ?: return showHelp()

    try {
        println("Input: ${args.joinToString(" ")}")
        println("Output: ${opFunc(args[0].toInt(), args[2].toInt())}")
    } catch (e: Exception) {
        println("Invalid Arguments")

        showHelp()
    }
}


fun showHelp() {
    println("""

        Simpla Calculator:
            Input: 3 * 4
            Output: 12

    """.trimIndent())
}

fun plus(arg0: Int, arg1: Int): Int{
    return arg0 + arg1
}

fun minus(arg0: Int, arg1: Int): Int{
    return arg0 - arg1
}

fun times(arg0: Int, arg1: Int): Int{
    return arg0 * arg1
}

fun devide(arg0: Int, arg1: Int): Int{
    return arg0/arg1
}

