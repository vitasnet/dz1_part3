package ru.geekbrains.myapplicationg

data class data_class()

data class Weather(var town: String,var temperature: Int)

val weather = Weather("Москва",20)
val newCopy = weather.copy(town = "Санкт-Петербург")

