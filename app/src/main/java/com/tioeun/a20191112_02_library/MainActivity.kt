package com.tioeun.a20191112_02_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseAcivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        var url = "https://dispatch.cdnser.be/wp-content/uploads/2018/05/20180501224056_j.jpg"
        Glide.with(this).load(url).into(profileImg)
    }
}
