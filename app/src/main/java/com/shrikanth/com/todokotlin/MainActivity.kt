package com.shrikanth.com.todokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.shrikanth.com.data.DBApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var adapter: TodoAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add_todo.setOnClickListener {
            gotoNext()
        }
        setupList()
    }

    override fun onResume() {
        super.onResume()
        refreshList()
    }

    fun refreshList(){
        adapter!!.todos = DBApi.getTodos()
        adapter!!.notifyDataSetChanged()
    }
    fun setupList(){
        adapter = TodoAdapter(DBApi.getTodos())
        todo_list.adapter = adapter
        todo_list.layoutManager = LinearLayoutManager(this)
    }

    fun gotoNext(){
        val i = Intent(this, AddTodoActivity::class.java)
        startActivity(i)
    }

}
