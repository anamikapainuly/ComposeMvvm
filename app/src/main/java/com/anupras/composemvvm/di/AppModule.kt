package com.anupras.composemvvm.di

import com.anupras.composemvvm.category.interfaces.ICategoryRepository
import com.anupras.composemvvm.category.interfaces.IGetCategoriesUseCase
import com.anupras.composemvvm.category.repository.CategoryRepository
import com.anupras.composemvvm.category.usecase.GetCategoryUseCase
import com.anupras.composemvvm.service.CategoryService
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideJobService(retrofit: Retrofit): CategoryService{
        return retrofit.create(CategoryService::class.java)
    }

    @Module
    @InstallIn(SingletonComponent::class)
    interface AppModuleInt{
        @Binds
        @Singleton
        fun provideCategoryRepository(repository: CategoryRepository) : ICategoryRepository

        @Binds
        @Singleton
        fun provideCategoryUseCases(useCase: GetCategoryUseCase): IGetCategoriesUseCase
    }


}