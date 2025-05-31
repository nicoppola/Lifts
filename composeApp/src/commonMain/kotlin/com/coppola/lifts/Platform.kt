package com.coppola.lifts

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform