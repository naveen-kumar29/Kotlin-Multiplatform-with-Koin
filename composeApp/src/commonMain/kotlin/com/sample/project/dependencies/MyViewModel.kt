package com.sample.project.dependencies

import androidx.lifecycle.ViewModel

class MyViewModel(
    private val repository: MyRepository
): ViewModel() {
    fun getHelloWorldString(): String {
        return repository.helloWorld()
    }

    fun getApiCall(value:String):String {
        return repository.apiHelper(value)
    }
}