package qbit.platform

import kotlin.reflect.KClass
import kotlin.reflect.KParameter
import kotlin.reflect.KProperty

actual fun getRawType(obj: KProperty<*>): KClass<*> {
    TODO("not implemented yet")
}

actual fun getRawType(obj: KParameter): KClass<*> {
    TODO("not implemented yet")
}

actual fun getRawTypeOfActualTypeArgument(obj: KProperty<*>): KClass<*> {
    TODO("not implemented yet")
}