package com.shrikanth.com.data

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import com.shrikanth.com.models.Todo
import com.shrikanth.com.todokotlin.MyApplication

/**
 * Created by shrikanth on 11/5/17.
 *
 */
object DBApi{
    var DB_HELPER: DBHelper? = null

    fun CREATE_INSTANCE(context: MyApplication){
        DB_HELPER = DBHelper(context)
    }

    fun addTodo(todo: Todo){
        val db: SQLiteDatabase = DB_HELPER!!.writableDatabase
        val cv = ContentValues()
        cv.put(SQLStore.KEY_TITLE, todo.title)
        cv.put(SQLStore.KEY_DESCRIPTION, todo.description)
        db.insert(SQLStore.TABLE_TODOS, null, cv )
        db.close()
    }
    fun getTodos() : ArrayList<Todo>{
        val db: SQLiteDatabase = DB_HELPER!!.readableDatabase
        val cursor = db.query(SQLStore.TABLE_TODOS, arrayOf(SQLStore.KEY_TITLE, SQLStore.KEY_DESCRIPTION), null, null, null, null, null, null)
        val todos : ArrayList<Todo> = ArrayList()
        while (cursor.moveToNext()) {
            val t = Todo(cursor.getString(cursor.getColumnIndex(SQLStore.KEY_TITLE)),
                    cursor.getString(cursor.getColumnIndex(SQLStore.KEY_DESCRIPTION)))
            todos.add(t)
        }
        cursor.close()
        db.close()
        return todos
    }
}