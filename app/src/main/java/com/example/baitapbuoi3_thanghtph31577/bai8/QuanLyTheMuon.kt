package com.example.baitapbuoi3_thanghtph31577.bai8

import java.util.ArrayList

class QuanLyTheMuon {
    private var list : ArrayList<TheMuon> = ArrayList()

    fun showTheMuon() {
        if (list.size == 0) {
            println("Không có thẻ mươn nào")
        }else{
            for (i in 0 until list.size){
                println(list[i].toString())
            }
        }

    }

    fun addTheMuon() {
        var the = TheMuon()

        while (true) {
            println("Nhâp tên sv : ")
            var s = readln()
            if (s == "") {
                println("Tên sv phải được nhập")
            } else {
                the.name = s
                break
            }
        }

            while (true) {
                println("Nhâp tuổi sv : ")
                var s = readln()
                if (s == "" || !s.all { it.isDigit() }) {
                    if (s.toInt()<18){
                        println("Tuôi sv phải lớn hơn 18")

                    }else{

                    }
                } else {
                    the.age = s.toInt()
                    break
                }
            }

                while (true) {
                    println("Nhâp trường sv : ")
                    var s = readln()
                    if (s == "") {
                        println("Trường sv phải nhạp")
                    } else {
                        the.school = s
                        break
                    }
                }


                    while (true) {
                        println("Nhâp id thẻ mượn  : ")
                        var s = readln()
                        if (s == "") {
                            println("Phải nhập id thẻ mượn")
                        } else {
                            the.id = s
                            break
                        }
                    }

                        while (true) {
                            println("Nhâp ngày mượn   : ")
                            var s = readln()
                            if (s == "") {
                                println("Phải nhập ngày mượn")
                            } else {
                                the.borrowDate = s
                                break
                            }
                        }

                            while (true) {
                                println("Nhâp hạn trả  : ")
                                var s = readln()
                                if (s == "") {
                                    println("Phải nhập hạn trả")
                                } else {
                                    the.paymentDate = s
                                    break
                                }
                            }


                                while (true){
                                    println("Nhâp id sách   : ")
                                    var s = readln()
                                    if (s =="" || !s.all { it.isDigit() } ){
                                        println("Phải id sách ")
                                    }else{
                                        the.bookId = s.toInt()
                                        break
                                    }

        }



        list.add(the)


    }

    fun deleteTheMuon() {
        while (true){
            println("Nhập id thẻ mượn")
            var q = readln()
            if (q.isBlank()){
                println("Phải Nhập id thẻ mượn")

            }else{
                val index = list.indexOfFirst { it.id == q }
                if (index != -1){
                    list.removeAt(index)
                    println("xóa thành công")

                }else{
                    println("Không tìm thấy thẻ mượn")

                }
                break
            }
        }


    }

}