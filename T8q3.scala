object T8q3 extends App{

    val toUpper: String => String = str => str.toUpperCase()
    val toLower: String => String = str => str.toLowerCase()
    def formatNames(name: String)(formatFunction: String => String): String = formatFunction(name)

    println(formatNames("Benny")(toUpper))
    println(formatNames("Ni")(toUpper) + "roshan")
    println(formatNames("Saman")(toLower))
    println("Kumar" + formatNames("a")(toUpper))

}

