package com.example.MVVM.models

data class Quotes(
    val count: Int,
    val lastItemIndex: Int,
    val page: Int,
    val results: List<Results>,
    val totalCount: Int,
    val totalPages: Int,
) {}
