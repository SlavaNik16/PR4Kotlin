import sun.security.krb5.internal.crypto.Aes128

fun Task3(){
    println("Задание №3")
    val Alphabet: Array<String> = arrayOf(
        "А", "Б", "В", "Г", "Д", "Е", "Ё",
        "Ж", "З", "И", "Й", "К", "Л", "М",
        "Н", "О", "П", "Р", "С", "Т", "У",
        "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ",
        "Ы", "Ь", "Э", "Ю", "Я")

    val offset: Array<Int> = arrayOf(
        1, 2, 3, 4, 5, 6, 7,
        8, 9, 10, 11, 12, 13, 14,
        15, 16, 17, 18, 19, 20, 21,
        22, 23, 24, 25, 26, 27, 28,
        29, 30, 31, 32, 33)

    try {
        println("Введите слово(на русских буквах и без цифров): ")
        val slovo: String = readln().toUpperCase().toString()
        println("Введите цифру:\n1) Зашифровать\n2) Расшифровать")
        val number: Int = readln().toInt()
        when(number){
            1 -> Encryption(Alphabet, offset, slovo)
            2 -> Decryption(Alphabet, offset, slovo)
            else -> System.exit(0)
        }
        println()
    }catch (e: Exception){
        println("Неправильный формат!!!")
        System.exit(0)
    }
}
fun Encryption(Alphabet: Array<String>, offset: Array<Int> , slovo: String){
    var index = 0
    try {
        var num  = 0
        for(str in slovo) {
            num = 0
            index = Alphabet.indexOf(str.toString())
            num += (index + offset[index]) % 33
            Alphabet[num]
            print(Alphabet[num])
        }
    }catch (e:Exception){
        println()
        println("Пожалуйста не используйте другие символы!!!")
        System.exit(0)
    }
}

fun Decryption(Alphabet: Array<String>, mas: Array<Int>, slovoNew: String){
    var index = 0
    var num = 0
    var shifr = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
    var Alphabet2 = Alphabet.clone()
    try {
        for(str in shifr){
            index = Alphabet.indexOf(str.toString())
            num = (index + mas[index]) % 33
            Alphabet2[index] = Alphabet[num]
        }
        for(str in slovoNew) {
            index = Alphabet2.indexOf(str.toString())
            print(Alphabet[index])
        }
    }catch (e:Exception){
        println()
        println("Пожалуйста не используйте другие символы!!!")
        System.exit(0)
    }
}
