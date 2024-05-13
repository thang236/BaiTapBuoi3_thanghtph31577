package com.example.baitapbuoi3_thanghtph31577.bai8

class TheMuon : SinhVien() {
    var id : String? = null
    var borrowDate : String? = null
    var paymentDate : String? = null
    var bookId : Int? = null
    override fun toString(): String {
        return "TheMuon(name=$name, age=$age, school=$school idTheMuon=$id, borrowDate=$borrowDate, paymentDate=$paymentDate, bookId=$bookId)"
    }


}