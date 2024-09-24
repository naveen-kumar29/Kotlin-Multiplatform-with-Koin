package com.sample.project.dependencies

interface MyRepository {
    fun helloWorld(): String
    fun apiHelper(value:String):String
}

class MyRepositoryImpl(
    private val dbClient: DbClient
) : MyRepository {
    override fun helloWorld(): String {
        return "Hello World!"
    }

    override fun apiHelper(value:String): String {
        return value
    }
}