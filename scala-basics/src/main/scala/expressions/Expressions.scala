object Expressions extends App {
  
    val v = 1 + 8 //1 + 8 is an Expression
    // Similarly
    // + - * / & | ^ << >>  >>> (right shift with zero extension)

    val b = 1 == v // Boolean
    // == != > >= < <=

    val u = !(1 == v) // Unary operators
    // ! && ||

    var n = 5
    n += v 
    // -= *= /=

    // Changing the value of a variable cause "Side Effects"

    // Instructions vs Expression
    // Instruction: "Do" this (print, compute this etc)
    // Expression: has a "value" or a type

    // Never write while loop in scala, it imperative programming style
    var i = 0
    while(i < 10) {
        println(i)
        i += 1
    }
    // Never write while loop in scala, it imperative programming style

    // Everything in Scala is an Expression!

    val aWeirdValue = (aVar = 3) // Unit == void (in other lang)
    // Right hand side expression evaluates to Unit type
    // Unit is special type in Scala
    // value of Unit is () two round bracket parenthesis 
    println(aWeirdValue) // output as: ()

    // above while loop also return Unit, if you assign a variable to it.
    
    // Side effects: println(), whiles, reassigning of vars

    // Code blocks - special type of Expression in Scala
    val aCodeBlock = {
        val x1 = 5
        val x2 = x + 5

        if(x1 > x2) "Hello" else "Goodbye"
    }

    // Value of aCodeBlock is value of last expression. Which is GoodBye.
    // anything declared inside Code Block not visible outside

    // Difference between "Hello World" and println("Hello World")
    // "Hello World" : is a value of type String. String literal.
    // println("Hello World") : is side effect. Which returns Unit

    val aBoolean = {
        2 < 3
    }
    // aBoolean: true

    val anInt = {
        if(aBoolean) 567 else 123
        63
    }
    // anInt: 63
}
