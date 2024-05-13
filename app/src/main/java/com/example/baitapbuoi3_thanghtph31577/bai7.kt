package com.example.baitapbuoi3_thanghtph31577

fun main () {
    var list : ArrayList<Nguoi> = ArrayList()
    var ql : CBGV = CBGV(list)
    do {
        println("1. Hiển thị giảng viên")
        println("2. Thêm giảng viên")
        println("3. Xóa gv theo mã giảng viên")
        println("3. Xóa gv theo mã giảng viên")
        println("4. Tính lương thực tế của giảng viên")

        println("0.Thoát chương trình")
        println("Vui lòng chọn chức năng")

        var s =readln();
        when(s){
            "1" -> {
                ql.showTeacher()
            }
            "2"-> {
                var teacher = Nguoi()

                while (true) {
                    println("Vui lòng nhập tên: ")
                    s = readln()
                    if (s.isBlank()) { // Kiểm tra xem chuỗi nhập liệu là rỗng hoặc null
                        println("Tên không được để trống")
                    } else {
                        break // Thoát khỏi vòng lặp nếu tên hợp lệ
                    }
                }

                teacher.name = s


                while (true) {
                    println("Vui lòng nhập tuổi: ")
                    s = readln()
                    if (s.isBlank() || !s.all { it.isDigit() }) { // Kiểm tra xem chuỗi nhập liệu là rỗng hoặc null
                        println("tuổi phải lớn hơn 0 và phải là số")
                    } else {
                        break // Thoát khỏi vòng lặp nếu tên hợp lệ
                    }
                }
                teacher.age = s.toInt()

                println("Vui lòng nhập quê: ")
                s = readln()
                if (s==null){
                    println("Quê không được để trống")
                }
                teacher.countryside = s

                println("Vui lòng nhập mã gv: ")
                s = readln()
                if (s==null){
                    println("Mã không được để trống")
                }
                teacher.maGV = s

                println("Vui lòng lương cứng: ")
                s = readln()
                if (s==null || s.toDouble()<0.0){
                    println("lương cứng phải là số >=0 ")

                }
                teacher.luongCung = s.toDouble()

                println("Vui lòng lương thưởng: ")
                s = readln()
                if (s==null || s.toDouble()<0.0){
                    println("lương thươởng phải là số >=0 ")

                }
                teacher.luongThuong = s.toDouble()

                println("Vui lòng tiền phạt: ")
                s = readln()
                if (s=="" || s.toDouble()<0.0){
                    println("tiền phạt phải là số >=0 ")

                }
                teacher.tienPhat = s.toDouble()
                teacher.luongThuc = teacher.tinhLuongThuc()

                ql.addTeacher(teacher)
                println("Thêm thành công")
                
            }
            "3"->{
                println("Nhập mã gv cần xóa")
                s = readln()
                if (s == "") {
                    println("Mã gv không đc trống")
                }else{
                    ql.removeTeacher(s)
                    println("Xóa thành công")
                    
                }
            }
            "4"->{
                ql.getLuonThuc()
            }
            "0" -> {
                println("Bye Bye")
                break
            }
            else->{
                println("Vui lòng chọc các chức năng 1 , 2 ,3 ,4 ")
            }
        }



    }while (true)


}