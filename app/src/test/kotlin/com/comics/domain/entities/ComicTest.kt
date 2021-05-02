package com.comics.domain.entities

import kotlin.test.*

import com.comics.domain.vo.ComicStatus


class ComicTest {
    @Test fun testDeberiaTenerLosValoresEstablecidos() {
        val comic = Comic(
            name="One Punch Man",
            price=12.4,
            status=ComicStatus.ACCEPTABLE
        )

        assertEquals(12.4, comic.price)
        assertEquals("One Punch Man", comic.name)
        assertEquals(ComicStatus.ACCEPTABLE, comic.status)
    }
}
