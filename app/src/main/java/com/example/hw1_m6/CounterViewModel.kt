package com.example.hw1_m6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    private val counter = CounterModel()
    private val _counterValue = MutableLiveData(counter.getValue())
    val publicList: LiveData<String> = _counterValue

    fun inc(){
        counter.inc()
        _counterValue.value = counter.getValue()
    }

    fun dec(){
        counter.dec()
        _counterValue.value = counter.getValue()
    }
}
