package com.example.twowaysdatabindingwithviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel ():ViewModel(){

    val email=MutableLiveData<String>()

    init {
        email.value="Haider"
    }



}