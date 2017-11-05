package com.shrikanth.com.data

/**
 * Created by shrikanth on 11/5/17.
 */

open class Todo constructor(){

    var title: String? = null
    var description: String? = null

    var titleError: String? = null
    var descriptionError: String? = null

    constructor( title: String?, description: String?) :  this()

    fun valid(): Boolean{
        titleError = if (title?.isNotEmpty() == true) null else "Empty Title"
        descriptionError = if (description?.isNotEmpty() == true) null else "Empty Description"
        return title?.isNotEmpty() == true
                && description?.isNotEmpty() == true
    }



}
