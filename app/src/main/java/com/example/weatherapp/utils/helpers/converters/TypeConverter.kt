package com.example.weatherapp.utils.helpers.converters
import androidx.room.TypeConverter
import java.util.Date

class TypeConverter {

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }
}
