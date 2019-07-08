package qbit.platform

actual class Instant {
    actual fun toEpochMilli(): Long{
        TODO("not implemented yet")
    }
    actual fun getNano(): Int{
        TODO("not implemented yet")
    }
}

actual object Instants {
    actual fun ofEpochMilli(epochMilli: Long): Instant{
        TODO("not implemented yet")
    }
    actual fun ofEpochSecond(epochSecond: Long, nanoAdjustment: Long): Instant{
        TODO("not implemented yet")
    }
    actual fun now(): Instant{
        TODO("not implemented yet")
    }
}

actual class ZonedDateTime {
    actual fun withZoneSameInstant(zone: ZoneId): ZonedDateTime{
        TODO("not implemented yet")
    }
    actual fun toInstant(): Instant{
            TODO("not implemented yet")
        }
    actual fun getZone(): ZoneId{
            TODO("not implemented yet")
        }
    actual fun format(format: DateTimeFormatter): String{
            TODO("not implemented yet")
        }
    actual fun plusMonths(months: Long): ZonedDateTime{
            TODO("not implemented yet")
        }
}

actual object ZonedDateTimes {
    actual fun of(year: Int, month: Int, dayOfMonth: Int,
                  hour: Int, minute: Int, second: Int, nanoOfSecond: Int, zone: ZoneId): ZonedDateTime{
            TODO("not implemented yet")
        }
    actual fun ofInstant(instant: Instant, zone: ZoneId): ZonedDateTime{
            TODO("not implemented yet")
        }
    actual fun now(): ZonedDateTime{
            TODO("not implemented yet")
        }
    actual fun now(zone: ZoneId): ZonedDateTime{
            TODO("not implemented yet")
        }
    actual fun parse(text: CharSequence, formatter: DateTimeFormatter): ZonedDateTime{
            TODO("not implemented yet")
        }
}

actual abstract class ZoneId {
    actual abstract fun getId(): String
}

actual object ZoneIds {
    actual fun of(zoneId: String): ZoneId{
        TODO("not implemented yet")
    }
}

actual class DateTimeFormatter

actual object DateTimeFormatters {
    actual fun ofPattern(pattern: String): DateTimeFormatter{
        TODO("not implemented yet")
    }
}

actual class ZoneOffset: ZoneId()

actual object ZoneOffsets {
    actual fun ofHours(hours: Int): ZoneOffset{
        TODO("not implemented yet")
    }
}

actual class SimpleDateFormat actual constructor(format: String) {
    actual fun parse(source: String): Date{
        TODO("not implemented yet")
    }
}

actual class Date {
    actual fun getTime(): Long{
        TODO("not implemented yet")
    }
}
