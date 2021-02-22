fun main(){
    var a = 5
    var b = 1
    var logico: Boolean
    logico = a < b
    println("O valor de a < b  "  + logico )
    logico = a > b
    println("O valor de a > b  "  + logico )
    logico = a <= b
    println("O valor de a <= b  "  + logico )
    logico = a >= b
    println("O valor de a >= b  "  + logico )
    logico = a == b
    println("O valor de a == b  "  + logico )
    logico = a != b
    println("O valor de a != b  "  + logico )
    println("O valor de a  b  "  + a.compareTo(b) )

}