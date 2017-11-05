package com.shrikanth.com.todokotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.shrikanth.com.models.Todo

/**
 * Created by shrikanth on 11/5/17.
 */
class TodoAdapter(var todos: ArrayList<Todo>): RecyclerView.Adapter<TodoViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.todo_item_layout, parent, false)
        val vh = TodoViewHolder(view)
        return vh
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.update(todos.get(position))
    }

    override fun getItemCount(): Int {
     return if (todos.isNotEmpty()) todos.size else 0
    }

}