package com.example.em_kotlin_practics.Task_4

fun main() {
    val array = mutableListOf(142, null, 54, 43, null, 436, 88, null, 3, 11, 1, 43, 65, null, 644, 5, 245, 63, null)
    println(array)
    shakerSort(array)
    println(array)
}

fun shakerSort(list: MutableList<Int?>) {

    for (i in 0 until list.size - 1) {

        for (j in 0 until list.size - i - 1) {
            if (list[j] == null) {
                list[j] = list[j + 1]
                list[j + 1] = null
            } else if (list[j + 1] != null && list[j]!! > list[j + 1]!!){
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
            }
        }

        for (j in list.size - 1  downTo 0) {
            if (list[j] == null && j != list.size-1) {
                list[j] = list[j + 1]
                list[j + 1] = null
            } else if(j != 0 && list[j-1] != null && list[j] != null && list[j-1]!! > list[j]!!) {
                val temp = list[j]
                list[j] = list[j - 1]
                list[j - 1] = temp
            }
        }
    }
}