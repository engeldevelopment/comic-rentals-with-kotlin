package com.comics.domain.services.discounts

import com.comics.domain.entities.Comic


abstract class Discount {
    abstract protected var percentageOfDiscount: Double

    fun apply(comic: Comic): Double {
        return getPercentageOfDiscount(comic.price) 
    }

    fun getPercentageOfDiscount(price: Double): Double {
        return (price * percentageOfDiscount) / 100
    }
}