package com.soul.awesome.listviewtest

class Fruit(val name:String, val imageId: Int) {

    companion object fun getRandomLengthString(str: String): String {
        val n = (1..20).random()
        val builder = StringBuilder()
        repeat(n) {
            builder.append(str)
        }
        return builder.toString()
    }

}