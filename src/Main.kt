import java.io.File
import java.io.FileWriter

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //1
    val pathFileEx = "C:/МФТИ-РАБОТА/information.txt"
    val pathFileNew = "C:/МФТИ-РАБОТА/information_1.txt"
    writingToFile(pathFileEx, pathFileNew)
    readingFromFile(pathFileNew)
    println()

    //2
    val N = 10;
    val digitPathFile1 = "C:/МФТИ-РАБОТА/digit1.txt"
    val writerDigitFile = FileWriter(digitPathFile1, true)
    writerDigitFile.write("(")
    for (i in 1..N)
        if (i < N) writerDigitFile.write((2*i).toString()+",")
        else writerDigitFile.write((2*i).toString())
    writerDigitFile.write(")")
    writerDigitFile.close()
    println()

    //3
    val digitPathFile2 = "C:/МФТИ-РАБОТА/digit2.txt"
    val digitFile2       = File(digitPathFile2)
    val digitsSiring = digitFile2.readLines().toList()
    if (digitsSiring.size >=4) {
        println("Выводим требуемый результат для этой задачи")
        println("${digitsSiring.get(0)} ${digitsSiring.get(1)}")
        println("${digitsSiring.get(digitsSiring.size-2)} ${digitsSiring.get(digitsSiring.size-1)}")
    }
}

fun writingToFile( pathFileEx: String, pathFileNew: String)
{
    val fileEx       = File(pathFileEx)
    val listSiring =fileEx.readLines().toList()

    val writerFile = FileWriter(pathFileNew)
    for (i in listSiring.indices) writerFile.write(listSiring.get(i)+"\n")
    writerFile.close()
}

fun readingFromFile(pathFile: String)
{
    val fileEx       = File(pathFile)
    val listSiring =fileEx.readLines().toList()
    println("Результат чтения файла.")
    println(listSiring.toString())
}