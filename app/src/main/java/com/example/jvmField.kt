package com.example

import java.sql.Date

fun main() {
    val session=Session("Session",Date())
    val name= session.name
}

data class Session(@JvmField val name: String, val date: Date = Date())
