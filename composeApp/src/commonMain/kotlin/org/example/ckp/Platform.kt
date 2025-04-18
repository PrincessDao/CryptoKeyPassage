package org.example.ckp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform