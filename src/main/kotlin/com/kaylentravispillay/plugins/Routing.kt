package com.kaylentravispillay.plugins

import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.response.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Welcome to my example app written in Kotlin and deployed with docker. This application is hosted on Heroku for the full deployment.")
        }
    }

}
