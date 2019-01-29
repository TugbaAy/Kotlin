package ImportPackage
import Constants.piNumber

fun main(args: Array<String>) {


    //AreaofCircle = π r²

    var r = 4
    var areaofCircle =( r * r ) * piNumber

    println("Values \n radius : $r \n PI : $piNumber\n Area of Circle : $areaofCircle")

    // cast result to int

    println(" Area of Circle : " + areaofCircle.toInt())

}
