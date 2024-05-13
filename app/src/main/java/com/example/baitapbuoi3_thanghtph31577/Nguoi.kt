package com.example.baitapbuoi3_thanghtph31577

class Nguoi {
    var name: String? = null
    var age: Int? = null
    var countryside: String? = null
    var maGV: String? = null
    var luongThuong : Double = 0.0
    var luongCung : Double = 0.0
    var tienPhat : Double=0.0
    var luongThuc: Double = 0.0

    constructor()


    fun tinhLuongThuc () : Double{
        return (luongCung+luongThuong-tienPhat)
    }

    override fun toString(): String {
        return "Nguoi(name=$name, age=$age, countryside=$countryside, maGV=$maGV, luongThuong=$luongThuong, luongCung=$luongCung, tienPhat=$tienPhat, luongThuc=$luongThuc)"
    }


}