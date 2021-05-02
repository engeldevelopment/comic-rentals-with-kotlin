package com.comics.domain.services

import kotlin.test.*

import com.comics.domain.entities.Comic
import com.comics.domain.vo.ComicStatus


class ObtainPercentageOfDiscountServiceTest {
    val obtainPercentageOfDiscount = ObtainPercentageOfDiscountService()

    @Test
    fun `un comic excellent tendrá un diez porciento de descuento` () {
        val comic = Comic(
            name="Baki",
            price=20.0,
            status=ComicStatus.EXCELLENT
        )

        val amount = obtainPercentageOfDiscount.apply(comic)

        assertEquals(18.0, amount)
    }

    @Test
    fun `un comic good tendrá un veinte porciento de descuento` () {
        val comic = Comic(
            name="Baki",
            price=20.0,
            status=ComicStatus.GOOD
        )

        val amount = obtainPercentageOfDiscount.apply(comic)

        assertEquals(16.0, amount)
    }

    @Test
    fun `un comic acceptable tendrá un veinticinco porciento de descuento` () {
        val comic = Comic(
            name="Baki",
            price=20.0,
            status=ComicStatus.ACCEPTABLE
        )

        val amount = obtainPercentageOfDiscount.apply(comic)

        assertEquals(15.0, amount)
    }

    @Test
    fun `un comic impaired tendrá un treinta porciento de descuento` () {
        val comic = Comic(
            name="Baki",
            price=20.0,
            status=ComicStatus.IMPAIRED
        )

        val amount = obtainPercentageOfDiscount.apply(comic)

        assertEquals(14.0, amount)
    }

    @Test
    fun `un comic damaged tendrá un cincuenta porciento de descuento` () {
        val comic = Comic(
            name="Baki",
            price=20.0,
            status=ComicStatus.DAMAGED
        )

        val amount = obtainPercentageOfDiscount.apply(comic)

        assertEquals(10.0, amount)
    }
}