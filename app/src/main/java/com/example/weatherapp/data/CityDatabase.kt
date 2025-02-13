package com.example.weatherapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.weatherapp.model.CityWeather
import com.example.weatherapp.model.MeasureUnit
import com.example.weatherapp.utils.helpers.converters.TypeConverter


@Database(entities = [CityWeather::class, MeasureUnit::class], version = 2, exportSchema = false)
@TypeConverters(TypeConverter::class)
abstract class CityDatabase : RoomDatabase() {
    abstract fun cityDao(): CityDatabaseDAO
}