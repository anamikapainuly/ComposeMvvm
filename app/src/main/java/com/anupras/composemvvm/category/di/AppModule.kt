package com.anupras.composemvvm.category.di

import com.anupras.composemvvm.category.interfaces.ICategoryRepository
import com.anupras.composemvvm.category.repository.CategoryRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Module
    @InstallIn(SingletonComponent::class)
    interface AppModuleInt{
        @Binds
        @Singleton
        fun provideCategoryRepository(repository: CategoryRepository) : ICategoryRepository
    }
}