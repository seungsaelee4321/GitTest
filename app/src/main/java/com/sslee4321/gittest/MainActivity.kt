package com.sslee4321.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    fun init() {
        btn_test.setOnClickListener {
            Toast.makeText(this@MainActivity, "test",
                Toast.LENGTH_SHORT).show()
        }
    }
}