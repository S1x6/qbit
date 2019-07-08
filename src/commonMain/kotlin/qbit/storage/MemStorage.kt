package qbit.storage

import qbit.ns.Key
import qbit.ns.Namespace
import qbit.QBitException

class MemStorage : Storage {

    private val data = HashMap<Namespace, HashMap<Key, ByteArray>>()

    override fun add(key: Key, value: ByteArray) {
        if (!nsMap(key).containsKey(key)) {
            nsMap(key)[key] = value
        } else {
            throw QBitException("Value with key $key already exists")
        }
    }

    override fun overwrite(key: Key, value: ByteArray) {
        if (nsMap(key).containsKey(key)) {
            nsMap(key)[key] = value
        } else {
            throw QBitException("Value with key $key does not exists")
        }
    }

    private fun nsMap(key: Key) = data.getOrPut(key.ns) { HashMap() }

    override fun load(key: Key): ByteArray? = data[key.ns]?.get(key)

    override fun keys(namespace: Namespace): Collection<Key> = (data[namespace]?.keys as? Collection<Key>) ?: setOf()

    override fun subNamespaces(namespace: Namespace): Collection<Namespace> =
            data.keys.asSequence()
                    .filter { it.isSubNs(namespace) }
                    .toList()

    override fun hasKey(key: Key): Boolean = nsMap(key).containsKey(key)

}