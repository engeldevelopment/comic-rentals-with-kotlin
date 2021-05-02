package com.comics.domain.services

import com.comics.domain.entities.Comic
import com.comics.domain.services.discounts.*
import com.comics.domain.vo.ComicStatus


class ObtainPercentageOfDiscountService {
   fun apply(comic: Comic): Double {
       var discount = 0.0
       if (comic.status == ComicStatus.EXCELLENT) {
           discount = ExcellentComicDiscount().apply(comic)
       } else if (comic.status == ComicStatus.GOOD) {
           discount = GoodComicDiscount().apply(comic)
       } else if (comic.status == ComicStatus.ACCEPTABLE) {
           discount = AcceptableComicDiscount().apply(comic)
       } else if (comic.status == ComicStatus.IMPAIRED) {
           discount = ImpairedComicDiscount().apply(comic)
       } else if (comic.status == ComicStatus.DAMAGED) {
           discount = DamagedComicDiscount().apply(comic)
       }
       return comic.price - discount
   }
}