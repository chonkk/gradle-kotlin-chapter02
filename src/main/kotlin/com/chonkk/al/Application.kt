package com.chonkk.al


fun main() {
    sample3()
    sample2()
    sample1()
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
