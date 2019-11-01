import com.rsk.Person
import com.rsk.PersonConst

fun main(args: Array<String>) {
    println("Hello World")

    val daniel = Person()

    daniel.Name = "Daniel"

    println("Name is: ${daniel.Name}")

    daniel.Name = "Gilmer"

    println("Name is: ${daniel.Name}")

    //daniel = Person() it is not possible if the variable is val instead of var

    val gilmer = PersonConst("Jose")

    println("Second Name is : ${gilmer.Name}")

    gilmer.Name = "Gilmer"

    println("Second Name is :${gilmer.Name}")

    gilmer.display()

    gilmer.displayWithLambda(::printName)

}

fun printName(name: String) {
    println(name)
}
