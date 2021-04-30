package com.comics.domain.entities;

import com.comics.domain.vo.ComicStatus


class Comic(
    var name: String,
    var price: Double,
    var status: ComicStatus) {
}