import java.util.HashMap

fun <K, V> buildMap(mapFun: HashMap<K, V>.() -> Unit) : Map<K, V> {
    val map = HashMap<K, V>()
    map.mapFun()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
