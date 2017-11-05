package com.shrikanth.com.data

/**
 * Created by shrikanth on 11/5/17.
 *
 */
class SQLStore {
    companion object {
        val TABLE_TODOS: String = "todos"
        val KEY_ID: String = "id"
        val KEY_TITLE: String = "title"
        val KEY_DESCRIPTION: String = "description"



        val TODO_TABLE_CREATE  = "CREATE TABLE  $TABLE_TODOS " +
                "($KEY_ID INTEGER PRIMARY KEY, $KEY_TITLE TEXT, $KEY_DESCRIPTION  TEXT )"

        val GET_TODOS = "SELECT * FROM $TABLE_TODOS"

    }
}