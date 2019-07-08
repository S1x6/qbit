package qbit.platform

actual class IdentityHashMap<K, V> actual constructor() {
    actual val values: MutableCollection<V>
        get() {
            TODO("not implemented yet")
        }

    actual operator fun get(key: K): V? {
        TODO("not implemented yet")
    }
    actual fun containsKey(key: K): Boolean {
        TODO("not implemented yet")
    }
}

actual operator fun <K, V> IdentityHashMap<K, V>.set(key: K, value: V) {
}

actual inline fun <K, V> IdentityHashMap<out K, V>.filterKeys(predicate: (K) -> Boolean): Map<K, V>{
    TODO("not implemented yet")
}


actual class KeySetView<K, V>

actual fun <K, V> KeySetView<K, V>.asSequence(): Sequence<K>{
    TODO("not implemented yet")
}

actual class WeakHashMap<K, V> actual constructor() {
    actual operator fun get(key: K): V?{
        TODO("not implemented yet")
    }
}

actual operator fun <K, V> WeakHashMap<K, V>.set(key: K, value: V){
    TODO("not implemented yet")
}