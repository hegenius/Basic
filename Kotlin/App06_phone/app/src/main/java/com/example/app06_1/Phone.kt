package com.example.app06_1

// 두개 값만 있는데 3개 호출하고 싶을 때 생성자로 호출
data class Phone(val id:Int, var name:String, var tel:String) {
    constructor(name: String, tel: String):this(0, name, tel)
}
