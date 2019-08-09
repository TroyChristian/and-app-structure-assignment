package com.lambdaschool.android.organization.util

import java.text.NumberFormat

class TextUtils {
    companion object {
        // TODO: format the currency using NumberFormat.getCurrencyInstance - refer to the docs
        fun formatCurrency(price : Double) : String {
            return "${NumberFormat.getCurrencyInstance().format(price)} price"
        }

        // TODO: format the percent using NumberFormat.getPercentInstance - refer to the docs
        fun formatPercent(discount : Double) : String {
            return "${NumberFormat.getPercentInstance().format(discount)} discount"
        }
        fun formatProductName(name:String):String{
                return "$name"}
        fun formatProductDesc(desc: String):String{
           return "${desc}"
         }
    }}


//comment