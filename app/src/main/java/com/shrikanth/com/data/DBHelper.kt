package com.shrikanth.com.data

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log


/**
 * Created by shrikanth on 11/5/17.
 *
 */


class DBHelper constructor(context: Context) : SQLiteOpenHelper(context, DBConfig.DBNAME, null, DBConfig.DB_VERSION) {

    init { Log.d("TAG", "This ($this) is a singleton") }


    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(SQLStore.TODO_TABLE_CREATE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }



}


