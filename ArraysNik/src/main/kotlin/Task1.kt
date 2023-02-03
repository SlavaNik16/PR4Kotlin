

fun Task1(){
    println("Задание №1")
    try {
        println("Введите кол-во строк: ")
        val m: Int = readln().toInt() - 1
        println("Введите кол-во столбцов: ")
        val n: Int = readln().toInt() - 1
        if (m <= 0 && n <= 0) {
            println("Пустой массив!!!")
            System.exit(0);
        }
        var mas = CreateMas(m, n)
        CountNum(mas, m, n)
    }catch (e: Exception){
        println("Неверный формат!!!")
        System.exit(0)
    }
}



fun  CountNum(mas:Array<Array<String>>, m:Int, n: Int){
    var Numb: MutableList<String> = mutableListOf<String>("0","1","2","3","4","5","6","7","8","9")
    val count = Numb.size;
    for(i in 0..m) {
        for (j in 0..n) {
            for (num in mas[i][j]) {
                if (num.toString() in Numb) {
                    Numb.remove(num.toString());
                }
            }
        }
    }
    return println("В массиве использовано ${count - Numb.size} различных цифр")
}