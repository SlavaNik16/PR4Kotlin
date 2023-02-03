import javafx.application.Application
import java.lang.Exception

fun main(args: Array<String>) {
    println("Введите номер:")
    while(true){
        println("""Введите номер:
            1) Задание 1
            2) Задание 2
            3) Задание 3
        """.trimMargin())
        when(readln()) {
            "1" -> Task1()
            "2" -> Task2()
            "3" -> Task3()
            else -> System.exit(0)
        }
    }
}
fun CreateMas(m:Int,n:Int):Array<Array<String>>{
    var mas: Array<Array<String>> = arrayOf<Array<String>>()
    for (i in 0..m) {
        var array = arrayOf<String>()
        for (j in 0..n) {
            print("Введите целое число a[$i][$j] = ")
            array += readln()
            try {
                array[j].toInt()
            }catch (e: Exception){
                println("Неверный формат!!!");
                System.exit(0);
            }
        }
        println()
        mas += array;
    }

    for (i in 0..m) {
        for (j in 0..n) {
            print("${mas[i][j]} ")
        }
        println()
    }
    return mas
}

