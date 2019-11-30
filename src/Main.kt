import java.awt.Color


fun String.forEachWord(function: (Any) -> Unit) {
    for (word in this.split(" ")) {
        function(word)
    }
}

fun Int.bitIsOneAtPosition(position: Int): Boolean {
    var num = Integer.toBinaryString(this).toInt()
    var c = 1
    while (c++ < position) {
        num /= 10
    }
    return num % 10 == 1// return (this shr position)%2 == 0
}

fun Int.toColor(): Color {
    val num = Integer.toBinaryString(this)
    //println(num)
    val alpha = num.substring(0, 8)
    val red = num.substring(8, 16)
    val green = num.substring(16, 24)
    val blue = num.substring(24, 32)

    val a = Integer.parseInt(alpha, 2)
    val r = Integer.parseInt(red, 2)
    val g = Integer.parseInt(green, 2)
    val b = Integer.parseInt(blue, 2)

    return Color(r, g, b, a)

}


fun main() {
    // Create forEachWord function
    "please print each word".forEachWord { word ->
        println(word)

    }

    println(4.bitIsOneAtPosition(3))

    val c = (-0x775FB34F).toColor()
    println(c) // Color(a=136, r=160, g=76, b=177)
}


