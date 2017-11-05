package com.shrikanth.com.todokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add_todo.setOnClickListener {
            gotoNext()
        }
    }

    fun gotoNext(){
        val i = Intent(this, AddTodoActivity::class.java);
        startActivity(i)
    }

}
