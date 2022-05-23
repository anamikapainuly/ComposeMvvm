package com.anupras.composemvvm.category.usecase

import com.anupras.composemvvm.category.`interface`.IGetCategoriesUseCase

class GetCategoryUseCase : IGetCategoriesUseCase{

    override fun getAllCategories(): String {
       return "category list"
    }

}