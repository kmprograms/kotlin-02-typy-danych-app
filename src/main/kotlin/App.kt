fun main(args: Array<String>) {
    /*
        Dwa sposoby deklarowania zmiennych w Kotlin.

        var - możesz zmienić wartość zmiennej, kiedy tylko tego potrzebujesz

        val - nie możesz zmieniać wartości, kiedy już raz na początku ją przypiszesz
    */

    var name = "Krzysztof"
    name = "Jan"

    val age = 18
    // age = 12

    println(name)
    println("Name: $name")

    /*
        Kotlin to język typowany statycznie.
        Oznacza to, że kiedy na początku ustalisz wartość zmiennej, co również oznacza, że ustalisz
        jej typ, to nie możesz go później zmienić.
    */

    name = "Zosia"
    // name = 10

    var email: String = "km@gmail.com"

    var city: String
    city = "Warszawa"

    val counter: Int
    counter = 11

    // var country
    // country = "Polska"

    // var country: String
    // country = 100

    // Typy liczbowe
    // Byte, Short, Int, Long, Float, Double

    var v: Number = 1000
    v = 34.4

    var v2 = 23.4
    // v2 = 100

    var v3 = 100
    // v3 = 45.6

    var a1: UByte = 0u
    var a2: UShort = 1111u
    var a3: UInt = 1111u
    var a4: ULong = 11111u

    var c = 'k'
    var cc: Char = 'i'

    val isAdult = true
    val isFast: Boolean = false

    var o1 = 1_000_000_000
    var o2 = 0xaaa12
    var o3 = 0b101011100111

}
