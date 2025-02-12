package org.mirai.crypto_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform