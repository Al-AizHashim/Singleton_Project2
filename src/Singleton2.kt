class A {
    init {
        println("Class init method. Singleton name property : ${Singleton.name}")
    }

    object Singleton  {
        init {
            println("Singleton class is invoked")
        }
        var name="Kotlin objects"
        fun printName(){
            println(name)
        }
    }
}

fun main(args: Array<String>) {
    var a = A()
}
