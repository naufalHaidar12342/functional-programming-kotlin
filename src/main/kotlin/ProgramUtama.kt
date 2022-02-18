fun main() {
    println(fullName())
    println(fullName("dono","wadidaw"))

}
//sebuah fungsi dengan gaya functional programming
//dan memiliki default value pada parameternya

fun fullName(firstName:String="Naufal",lastName:String="Heydar"):String{
    return "Hello there,$firstName $lastName"
}

