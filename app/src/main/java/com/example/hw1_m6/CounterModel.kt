package com.example.hw1_m6

class CounterModel(
    private var value: Int = 0
){
    fun inc(){
        value++
    }

    fun dec(){
        value--
    }

    fun getValue() = value.toString()
}