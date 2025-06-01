package com.coppola.lifts.data

interface LiftsRepository {
    fun testing(): String
}

class LiftsRepositoryImpl(
    private val dbClient: DbClient
): LiftsRepository {
    override fun testing(): String {
        return "TESTINGGGGGG"
    }
}