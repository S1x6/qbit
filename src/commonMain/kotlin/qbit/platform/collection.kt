package qbit.platform

expect class IdentityHashMap<K, V>() {
    val values: MutableCollection<V>
    operator fun get(key: K): V?
    fun containsKey(key: K): Boolean
}

expect operator fun <K, V> IdentityHashMap<K, V>.set(key: K, value: V)

expect inline fun <K, V> IdentityHashMap<out K, V>.filterKeys(predicate: (K) -> Boolean): Map<K, V>

expect class KeySetView<K, V>

expect fun <K, V> KeySetView<K, V>.asSequence(): Sequence<K>

expect class WeakHashMap<K, V>() {
    operator fun get(key: K): V?
}

expect operator fun <K, V> WeakHashMap<K, V>.set(key: K, value: V)