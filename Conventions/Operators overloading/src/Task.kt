import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

class TimeIntervalRepeat(val timeInterval: TimeInterval, val times: Int)

operator fun TimeInterval.times(time: Int) = TimeIntervalRepeat(this, time)

operator fun MyDate.plus(repeat: TimeIntervalRepeat) = addTimeIntervals(repeat.timeInterval, repeat.times)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
