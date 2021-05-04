package com.comics.domain.services

import com.comics.domain.entities.Comic
import com.comics.domain.services.discounts.*
import com.comics.domain.vo.ComicStatus


class DiscountService {
   fun apply(comic: Comic): Double {
       val discount: Double = when(comic.status) {
           ComicStatus.EXCELLENT -> ExcellentComicDiscount().apply(comic)
           ComicStatus.GOOD -> GoodComicDiscount().apply(comic)
           ComicStatus.ACCEPTABLE -> AcceptableComicDiscount().apply(comic)
           ComicStatus.IMPAIRED -> ImpairedComicDiscount().apply(comic)
           ComicStatus.DAMAGED -> DamagedComicDiscount().apply(comic)
       }
       return comic.price - discount
   }
}