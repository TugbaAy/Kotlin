package Arrays

fun main(args: Array<String>) {

    var numbers : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println(numbers[0])
    println("Size of Array : " +numbers.size)

    var words : Array<String> = arrayOf("Tugba","Ay","Computer","Engineer")
    println(words[2])

    var anyType : Array<Any> = arrayOf(1,"Tugba",50.2,true)


    // range step

    var numbersinRnge = 1..20
    var firstToLast = 'a'..'z'

    println("First Element + "+numbersinRnge.first)
    println("Last Element "+numbersinRnge.last)
    println("Step in numbers "+numbersinRnge.step)


    // rangeTo

    var stepsNumber = 0.rangeTo(100).step(2)
    var isTrue = 10 in stepsNumber
    println("11 range içinde mi : " + isTrue)
    println(stepsNumber.first)



}