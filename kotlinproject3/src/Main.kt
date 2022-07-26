import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    var f = 1

    for (i in 1..a) {
        f = f * i
    }

    println(f)

}