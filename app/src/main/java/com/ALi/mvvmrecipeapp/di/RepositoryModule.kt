package com.ALi.mvvmrecipeapp.di

import com.ALi.mvvmrecipeapp.network.RecipeService
import com.ALi.mvvmrecipeapp.network.model.RecipeDtoMapper
import com.ALi.mvvmrecipeapp.repository.RecipeRepository
import com.ALi.mvvmrecipeapp.repository.RecipeRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
            recipeService: RecipeService,
            recipeMapper: RecipeDtoMapper,
    ): RecipeRepository{
        return RecipeRepository_Impl(
            recipeService = recipeService,
            mapper = recipeMapper
        )
    }
}

