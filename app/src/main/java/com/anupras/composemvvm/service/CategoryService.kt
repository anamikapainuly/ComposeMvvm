package com.anupras.composemvvm.service

import retrofit2.http.GET

interface CategoryService {

    @GET("categories.php")
    suspend fun getAllCategories(): String
}