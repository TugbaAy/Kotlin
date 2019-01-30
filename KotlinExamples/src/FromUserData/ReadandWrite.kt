package FromUserData

fun main(args: Array<String>) {

    //readLine is always String.

    // !! non null

    println("Enter the your name :")
    var name : String = readLine()!!
    println("Enter the your surname : ")
    var surname : String = readLine()!!
    println("Enter the your age : ")
    var age : Int = readLine()!!.toInt()
    println("ad : ${name?.length} soyad : ${surname.length} yaş: $age")
}