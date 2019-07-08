package qbit.platform

actual class BigDecimal actual constructor(v: Int) {
    actual constructor(v: Long): this(v.toInt()){
        TODO("not implemented yet")
    }
    actual fun unscaledValue(): BigInteger{
        TODO("not implemented yet")
    }
    actual fun scale(): Int{
        TODO("not implemented yet")
    }
}

actual class BigInteger actual constructor(array: ByteArray) {
    actual fun toByteArray(): ByteArray{
        TODO("not implemented yet")
    }
}

internal actual fun BigInteger.toBigDecimal(scale: Int): BigDecimal{
    TODO("not implemented yet")
}

actual operator fun BigDecimal.plus(other: BigDecimal): BigDecimal{
    TODO("not implemented yet")
}

actual operator fun BigDecimal.minus(other: BigDecimal): BigDecimal{
    TODO("not implemented yet")
}