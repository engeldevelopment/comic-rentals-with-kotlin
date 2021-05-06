package com.comics.domain.services

import com.comics.domain.entities.Comic


class AmountToPayWithDiscountService {
   val discountService: DiscountService = DiscountService()

   fun calculate(comic: Comic): Double {
       val discount = discountService.call(comic)
       return comic.price - discount
   }
}