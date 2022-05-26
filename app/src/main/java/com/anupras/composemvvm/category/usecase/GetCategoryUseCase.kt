package com.anupras.composemvvm.category.usecase

import com.anupras.composemvvm.category.interfaces.ICategoryRepository
import com.anupras.composemvvm.category.interfaces.IGetCategoriesUseCase
import javax.inject.Inject

class GetCategoryUseCase @Inject constructor(
    val repo: ICategoryRepository
): IGetCategoriesUseCase {

    override fun getAllCategories(): String {
       return "category list"
    }

}