package com.shrikanth.com.todokotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.shrikanth.com.models.Todo

/**
 * Created by shrikanth on 11/5/17.
 */
class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    var title: TextView? = null
    var description: TextView? = null


    init {
        title = itemView.findViewById(R.id.title)
        description = itemView.findViewById(R.id.description)
    }

    fun update(todo: Todo) {
        title?.text = todo.title
        description?.text = todo.description
    }
}
