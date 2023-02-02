import sun.security.krb5.internal.crypto.Aes128

fun Task3(){
    println("Задание №3")
    val Alphabet: Array<String> = arrayOf(
        "А", "Б", "В", "Г", "Д", "Е", "Ё",
        "Ж", "З", "И", "Й", "К", "Л", "М",
        "Н", "О", "П", "Р", "С", "Т", "У",
        "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ",
        "Ы", "Ь", "Э", "Ю", "Я")

    val mas: Array<Int> = arrayOf(
        1, 2, 20, 21, 5, 22, 23,
        24, 8, 9, 10, 11, 32, 16,
        17, 18, 19, 9, 30, 31, 12,
        13, 14, 25, 26, 6, 7, 27,
        28, 23, 4, 15, 33)

    println("Введите слово(на русских буквах и без цифров): ")
    try {
        val player: String = readln().toUpperCase().toString()
        var index = 0
        var num  = 0
        for(str in player) {
            num = 0
            index = Alphabet.indexOf(str.toString())
            num += mas[index] + index
            if (num >= Alphabet.size) num -= Alphabet.size
            print(Alphabet[num])
        }
        println()
    }catch (e:Exception){
        println("Неверный формат!!!")
        System.exit(0)
    }
}