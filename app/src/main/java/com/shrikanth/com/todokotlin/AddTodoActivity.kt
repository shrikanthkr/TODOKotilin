package com.shrikanth.com.todokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.shrikanth.com.data.Todo
import kotlinx.android.synthetic.main.activity_add_todo.*

/**
 * Created by shrikanth on 11/5/17.
 */
class AddTodoActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_todo)
        setupListeners()
    }

    fun setupListeners(){
        submit_button.setOnClickListener{
            val t = Todo()
            t.title = title_edittext.editText!!.text.toString()
            t.description = description_edittext.editText!!.text.toString()
            if (t.valid()){
                Toast.makeText(baseContext, "Its a valid Todo", Toast.LENGTH_SHORT).show()
            }else{
                title_edittext.error = t.titleError
                description_edittext.error = t.descriptionError
            }
        }
    }

}
