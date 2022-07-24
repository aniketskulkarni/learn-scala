object ValuesVariablesTypes extends App {
  
    val anInt: Int = 10
    val aShort: Short = 23
    val aLong: Long = 32453424234L
    val aFloat: Float = 12.5f
    val aDouble: Double = 98273489273.98345
    val aChar: Char = 'a'
    val aString: String = "this is string"
    // val is immutable, which means can not be changed once declared

    var aVariable: Int = 100
    aVariable = 200
    // var can be reassigned a new value

    val inferType = 500 // this is Int 
    // compiler infers the type
}
