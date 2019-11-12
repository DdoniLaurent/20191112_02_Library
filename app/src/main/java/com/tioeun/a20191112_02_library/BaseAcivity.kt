package com.tioeun.a20191112_02_library

import androidx.appcompat.app.AppCompatActivity

abstract class BaseAcivity : AppCompatActivity() {

    abstract fun setupEvents()

    abstract fun setValues()
}