package collections

/**
 * Created by avcbcoder on 17-06-2018.
 */
fun main(args: Array<String>) {
    var myList = listOf<String>("Jennifer", "Aniston", "Winget", "Lawrence", "Lopez", "garner", "conelly") // Immutable
    var immut = mapOf<Int, String>(2 to "av", 3 to "cb", 4 to "coder") // Immutable Map
    var map = HashMap<Int, String>() // Mutable

    for (i in 0..myList.size - 1) {
        var p: Pair<Int, String> = Pair(i, myList.get(i)) // Pair in kotlin
        map.put(p.first, p.second)
    }
    println(map)
    for (i in map.keys)
        print("$i ${map.get(i)}  ")

}
