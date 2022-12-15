package com.tomgao.plugins

import com.tomgao.routes.customerRouting
import com.tomgao.routes.getOrderRoute
import com.tomgao.routes.listOrdersRoute
import com.tomgao.routes.totalizeOrderRoute
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

// the configureRouting function is already invoked in our Application.module()
fun Application.configureRouting() {

    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
//        get("/") {
//            call.respondText("Hello World!")
//        }
    }
}
