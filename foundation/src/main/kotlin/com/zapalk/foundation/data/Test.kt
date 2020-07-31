package com.zapalk.foundation.data.com.zapalk.foundation.data

import com.zapalk.foundation.data.stringSuffixer
import com.zapalk.foundation.security.*
import java.util.*


fun main(args: Array<String>) {

    val p = Professor()
    p.name = "Raj"
    p.designation = "AP"

    SpringApplication.main(null)

    println(p.toString())
    println(stringSuffixer("ea"))
    var arra = arrayOf(90, 200, 13)
    arra.forEach { print(it) }
    println(sortArray(arra))
    arra.forEach { print(it) }
    Collections.sort(arra.toList())
    arra.forEach { print(it) }
    Arrays.sort(arra)
    arra.forEach { print(it) }

    println(TestGroovy.getSurlper())

}

fun sortArray(arr: Array<Int>) = Collections.sort(arr.toIntArray().toList());

fun test() {

}