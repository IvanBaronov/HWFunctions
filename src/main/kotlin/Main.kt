

//для тестирования функций поменяйте их параметры в методе main
//каждая функция соответсвует одному заданию

fun main() {
    println(isPalindrome("radar"))
    println(positivesSum(listOf(1, -2, 3, -4, 5)))
    println(getUniqueStrings(mutableListOf("apple", "banana", "kiwi"), mutableListOf("banana", "orange", "kiwi")))
    println(getFactorial(5))
    println(getEvenNumbers(listOf(1, 2, 3, 4, 5, 6)))
}


//Задание 1. Напишите функцию, которая принимает строку и проверяет, является ли она палиндромом.
fun isPalindrome(inputString: String) : Boolean {
    var reverseString = ""
    var length = inputString.length
    for (i in (length - 1) downTo 0) {
        reverseString += inputString[i]
    }
    return inputString.equals(reverseString, ignoreCase = true)
}


//Задание 2. Напишите функцию, которая принимает список чисел и возвращает сумму всех положительных чисел.

fun positivesSum(numbersList: List<Int>) : Int {
    var sum = 0
    for (i in numbersList) if (i > 0) sum+=i
    return sum
}



//Задание 3. Напишите функцию, которая принимает два списка строк и возвращает новый список,
// содержащий только уникальные строки из обоих списков.

fun getUniqueStrings(list1: MutableList<String>, list2: MutableList<String>) : List<String> {
    for (string in list1) if (!(list2.contains(string))) list2.add(string)
    //обход list1, если list2 не содержит данный эл-т list1, то добавляем его в list2
    return list2
}


//Задание 4. Напишите функцию, которая принимает число и возвращает его факториал

fun getFactorial(number: Int) : Long {
    var factorial: Long = 1
    for (i in 1..number) {
        factorial *= i
        }
    return factorial
}



//Задание 5. Напишите функцию, которая принимает список чисел
// и возвращает новый список, содержащий только четные числа

fun getEvenNumbers(numbersList: List<Int>) : MutableList<Int> {
    val evenList = mutableListOf<Int>()
    for (i in numbersList) if (i % 2 == 0) evenList.add(i)
    return evenList
}
