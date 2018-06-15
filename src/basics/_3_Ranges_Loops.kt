package basics

/**
 * Created by avcbcoder on 16-06-2018.
 */
//double dot operator
fun main(args: Array<String>) {

    var r1 = 1..5//1,2,3,4,5
    r1 = 1.rangeTo(5)

    var r2 = 5..1//Invalid
    println(2 in r2)

    var r3 = 5 downTo 1//reverse mode
    r3 = 5.downTo(1)

    var r4 = 1..5 step 2//1 3 5

    var r5 = 'a'..'z'//'a' 'b' 'c' ... 'z'

    for (i in r5)
        print("$i ")

//-----------------------------------
    outer@ for (i in 1..4) {
        inner@ for (j in 5..8) {
            println("${i} ${j}")
            if (i == 2 && j == 6)
                break@outer
        }
    }

}