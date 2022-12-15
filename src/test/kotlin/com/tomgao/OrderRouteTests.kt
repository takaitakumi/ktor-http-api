package com.tomgao

import com.tomgao.plugins.configureRouting
import com.tomgao.plugins.configureSerialization
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*

import kotlin.test.Test

import kotlin.test.assertEquals

/**
 * @author： tomgao
 * @date：  2022-12-15 21:36
 * @Description:
 */

class OrderRouteTests {
    @Test
    fun testGetOrder() = testApplication {
//        Please make sure that you use unique name for the plugin and don't install it twice. Conflicting application plugin is already installed with the same key as `ContentNegotiation`
//        application {
//            configureRouting()
//            configureSerialization()
//        }
        val response = client.get("/order/2020-04-06-01")
        assertEquals(
            """{"number":"2020-04-06-01","contents":[{"item":"Ham Sandwich","amount":2,"price":5.5},{"item":"Water","amount":1,"price":1.5},{"item":"Beer","amount":3,"price":2.3},{"item":"Cheesecake","amount":1,"price":3.75}]}""",
            response.bodyAsText()
        )
        assertEquals(HttpStatusCode.OK, response.status)
    }
}