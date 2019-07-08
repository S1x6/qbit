package qbit.platform

import kotlin.collections.filterKeys as filterKeysImpl
import kotlin.collections.getOrPut as getOrPutImpl
import kotlin.collections.asSequence as asSequenceImpl

actual typealias IdentityHashMap<K, V> = java.util.IdentityHashMap<K, V>

actual inline fun <K, V> IdentityHashMap<out K, V>.filterKeys(predicate: (K) -> Boolean): Map<K, V> {
    return this.filterKeysImpl(predicate)
}

actual operator fun <K, V> IdentityHashMap<K, V>.set(key: K, value: V) {
    put(key, value)
}

actual typealias KeySetView<K, V> = java.util.concurrent.ConcurrentHashMap.KeySetView<K, V>

actual fun <K, V> KeySetView<K, V>.asSequence(): Sequence<K> {
   return asSequenceImpl()
}

actual typealias WeakHashMap<K, V> = java.util.WeakHashMap<K, V>

actual operator fun <K, V> WeakHashMap<K, V>.set(key: K, value: V) {
    put(key, value)
}