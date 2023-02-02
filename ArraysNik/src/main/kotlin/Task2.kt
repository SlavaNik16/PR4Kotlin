import com.sun.org.apache.bcel.internal.generic.RETURN
import java.lang.Exception

fun Task2(){
    println("Задание №2")
    val m = 5 - 1
    var mas = CreateMas(m,m)

    println(MAIN(mas,m));
    println(SIDE(mas,m));


}
fun MAIN(mas: Array<Array<String>>, m:Int):String{
    for(i in 0..m/2){
        for(j in 0..m/2){
            if (i == j && mas[i][j] != mas[m-j][m-j]) return "Матрица не является симметричным относительно главной диагонали"
        }
    }
    return "Матрица является симметричным относительно главной диагонали"
}
fun SIDE(mas: Array<Array<String>>, m:Int):String{
    for(i in 0..m/2){
        for(j in 0..m/2){
            if (i == j && mas[i][m-j] != mas[m-j][i]) return "Матрица не является симметричным относительно побочной диагонали"
        }
    }
    return "Матрица является симметричным относительно побочной диагонали"
}