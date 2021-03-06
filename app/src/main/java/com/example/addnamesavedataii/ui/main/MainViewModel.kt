package com.example.addnamesavedataii.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
        val editTextContent = MutableLiveData<String>()

        val _displayEditTextContent = MutableLiveData<String>()
       val displayEditTextContent: LiveData<String>
            get() = _displayEditTextContent

        fun onDisplayEditTextContentClick() {
            _displayEditTextContent.value = editTextContent.value
        }
}