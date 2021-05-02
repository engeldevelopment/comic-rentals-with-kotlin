package com.comics.domain.services.discounts

import com.comics.domain.entities.Comic


abstract class Discount {
    abstract protected var percentageOfDiscount: Double

    fun apply(comic: Comic): Double {
        val discount = (comic.price * percentageOfDiscount) / 100
        return discount 
    }
}