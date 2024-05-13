package com.example.baitapbuoi3_thanghtph31577.bai8

fun main(){
    var ql = QuanLyTheMuon()

    do {

        println("1. Hiển thị Thẻ mượn")
        println("2. Thêm Thẻ mượn")
        println("3. Xóa Thẻ mượn theo mã Thẻ mượn")
        println("0.Thoát chương trình")
        println("Vui lòng chọn chức năng")
        var s = readln()

        when(s){
            "2"-> ql.addTheMuon()
            "1" -> ql.showTheMuon()
            "3"->{
                ql.deleteTheMuon()
            }
            "0" -> {
                println("Bye bye")
                break
            }else->{
                println("Vui lòng chọn đúng chức năng 1, 2 , 3 ")
            }
        }

    }while (true)


}