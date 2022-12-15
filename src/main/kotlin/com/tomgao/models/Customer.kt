package com.tomgao.models

import kotlinx.serialization.Serializable
/**
 * @author： tomgao
 * @date：  2022-12-14 15:28
 * @Description:
 */

@Serializable // 加了这个就可以把对象序列化为json
data class Customer(val id: String, val firstName: String, val lastName: String, val email: String)

val customerStorage = mutableListOf<Customer>()
