fun main(){
    name()
    var remainder = modulus (22,7)
    println(remainder)
    var addition = add(34,67,12,78)
    println(addition)
    fact()
}
fun name (){
    println("Hunter")
}
fun modulus (a:Int, b:Int) : Int{
    var mod = a % b
    return mod
}
fun add (num1:Int,num2:Int,num3:Int,num4:Int) :Int{
    var plus = num1 + num2 + num3 + num4
    return plus
}
fun fact (){
    println("I love coding")
}