package com.example.baitapbuoi3_thanghtph31577

class CBGV(var list : ArrayList<Nguoi>) {

    fun addTeacher(teacher: Nguoi) {
        list.add(teacher)
    }
    fun removeTeacher(id: String){
        val index = list.indexOfFirst { it.maGV == id }
        if (index!=-1) {
            list.removeAt(index)
        }else{
            println("Không thấy gv")
        }
    }

    fun showTeacher() {
        if (list.size==0){
            println("Không có giảng viên nào")
        }else{
            for (i in 0 until list.size)
                println(list[i].toString())
        }

    }

    fun getLuonThuc() {
        for (i in 0 until list.size)
            println("Lương của giảng viên ${list[i].name} là ${list[i].luongThuc} ")
    }









}