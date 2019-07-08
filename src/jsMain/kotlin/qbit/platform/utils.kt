package qbit.platform

actual fun currentTimeMillis(): Long {
    TODO("not implemented yet")
}

actual fun Int.toHexString(): String{
    TODO("not implemented yet")
}

actual abstract class MessageDigest {
    actual fun digest(input: ByteArray): ByteArray{
        TODO("not implemented yet")
    }
}

actual object MessageDigests {
    actual fun getInstance(algorithm: String): MessageDigest{
        TODO("not implemented yet")
    }
}

actual fun assert(boolean: Boolean){
    TODO("not implemented yet")
}