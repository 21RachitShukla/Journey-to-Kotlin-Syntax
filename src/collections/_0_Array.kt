package collections

import java.util.*

/**
 * Created by avcbcoder on 02-07-2018.
 */
fun main(args: Array<String>) {
    val mArr = arrayOf(1, 2, "string", 4.5)

    println(mArr.first())
    println(mArr.contains("string"))
    println(mArr.size)
    println(mArr.indexOf(4.5))
    println(mArr[1])

    val sqr = Array<Int>(5, { x: Int -> x * x })
    for (i in 0..(sqr.size - 1))
        print("${sqr[i]} ")
    println()

    println(Arrays.toString(sqr))

    println(sqr is Array<Int>)

    val final=0
    val static =0
    val instanceof =0
    val const=0
    val switch=0
    val extends =0
    val int=0

}