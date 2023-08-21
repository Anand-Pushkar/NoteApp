package com.dynamicdal.noteapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform