package collections

/**
 * Created by avcbcoder on 17-06-2018.
 */

/*
Immutable collections :
 List : listOf
 Map : mapOf
 Set : setOf

Mutable collections :
 List : ArrayList, arrayListOf, mutableListOf
 Map : HashMap, hashMapOf, mutableMapOf(Linked HashMap)
 Set : mutableSetOf, hashSetOf // set keeps same sequence while hashset doesn't
 */
fun main(args: Array<String>) {
    // This lambda function is initialization block in
    // which index will be passed and it will return value at that index
    var arr = Array<Int>(5) { 0 }
    for (element in arr)
        print("$element ")

    println("-----------------")

    var a: Array<Int>
    //.........size...idx..[val at idx]....
    a = Array(5, { i -> i * 2 })
    for (i in 0..a.size - 1)
        print("${a[i]} ")

    println("-----------------")

    var myList = listOf<String>("Jennifer", "Aniston", "Winget", "Lawrence", "Lopez", "garner", "conelly") // Immutable
    for (i in 0..myList.size - 1)
        println("${myList[i]} ${myList.get(i)}")

    var mutList: ArrayList<String> = ArrayList<String>(myList)
    println("copied   $mutList")

}
