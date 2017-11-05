package com.shrikanth.com.todokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.shrikanth.com.data.DBApi
import com.shrikanth.com.models.Todo
import kotlinx.android.synthetic.main.activity_add_todo.*
import kotlinx.coroutines.experimental.launch
import java.lang.Thread.yield


/**
 * Created by shrikanth on 11/5/17.
 *
 */
class AddTodoActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_todo)
        setupListeners()
        launch {
            tryCoRoutine()
            runOnUiThread({
                Toast.makeText(baseContext, "SHOW", Toast.LENGTH_LONG).show()
            })
        }


    }

    fun setupListeners(){
        submit_button.setOnClickListener{
            val t = Todo()
            t.title = title_edittext.editText!!.text.toString()
            t.description = description_edittext.editText!!.text.toString()
            if (t.valid()){
                Toast.makeText(baseContext, "Its a valid Todo", Toast.LENGTH_SHORT).show()
                DBApi.addTodo(t)
            }else{
                title_edittext.error = t.titleError
                description_edittext.error = t.descriptionError
            }
        }
    }

    suspend fun tryCoRoutine(){
        for( i in 1..1000000000){
        }
        Thread.sleep(5000)
    }


}
