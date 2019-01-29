package TypeCasting

fun main(args: Array<String>) {

    var shortNumber = 32767
    var intNumber = shortNumber.toInt()
    println("Type Casting \nfrom Short Type : $shortNumber \nto Int Type : " + intNumber)


    var intNumber2 = 45000
    var shortNumber2 = intNumber2.toShort()
    println("Type Casting \nfrom Int Type : $intNumber2 \nto Short Type : " + shortNumber2)


    var doubleNumber = 50.5567
    var intNumber3 = doubleNumber.toInt()
    println("Type Casting \nfrom Double Type : $doubleNumber \nto Int Type : " + intNumber3)


}