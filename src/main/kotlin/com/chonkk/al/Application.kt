package com.chonkk.al

fun main() {
    println(kotlinTypeException(true))
    println(kotlinTypeException(false))
//    println(kotlinTye("또 날세", 21))
//    println(javaType("날세", 20))
//    println(createMemoFor2("eee"))
//    println(createMemoFor("eee"))
    //sample3()
    //sample2()
//    sample1()
}
fun kotlinTypeException(status: Boolean): Int {
    return try {
        if (status) {
            throw RuntimeException()
        }
        1
    } catch (e: Exception) {
        2
    }
}
fun kotlinTye(name: String, age: Int): String {
    val status = if (age < 17) "어려" else "많아"
    return "$name, $status"
}
fun javaType(name: String, age: Int): String {
    var status: String
    if (age < 17) {
        status = "어려"
    } else {
        status = "많아"
    }

    return "$name, $status"
}
fun createMemoFor2(name: String): String {
    if (name == "eee") {
        val memo = """asdfasfasdfasdfasdf
        | asdfasdfasdf
        | sadfasdfasdfasdfasdf"""
        return memo.trimMargin()
    }
    return ""
}
fun createMemoFor(name: String): String {
    if (name == "eee") {
        val memo = """asdfasfasdfasdfasdf
        asdfasdfasdf
        sadfasdfasdfasdfasdf"""
        return memo
    }
    return ""
}

fun sample3() {
// Kotlin
    val message = "Success"

    println("Customer Status is $message !!!")
}

fun sample2() {
    fun test() = 0  // parameter 'n'을 사용하지 않는다는 경고 발생!
    println(test())
}
fun sample1() {
    val greet = "hello" // 변수 타입 지정
    println(greet)
}
