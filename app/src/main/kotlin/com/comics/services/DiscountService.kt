package com.comics.domain.services

import com.comics.domain.entities.Comic
import com.comics.domain.services.discounts.*
import com.comics.domain.vo.ComicStatus


class DiscountService {
    var typeOfDiscount: Discount = ExcellentComicDiscount()

    fun call(comic: Comic): Double {
        typeOfDiscount = when(comic.status) {
           ComicStatus.EXCELLENT -> ExcellentComicDiscount()
           ComicStatus.GOOD -> GoodComicDiscount()
           ComicStatus.ACCEPTABLE -> AcceptableComicDiscount()
           ComicStatus.IMPAIRED -> ImpairedComicDiscount()
           ComicStatus.DAMAGED -> DamagedComicDiscount()
       }
       val discount: Double = typeOfDiscount.apply(comic)
       return discount
    }
}