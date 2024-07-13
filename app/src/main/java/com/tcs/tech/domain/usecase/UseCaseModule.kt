package com.tcs.tech.domain.usecase

import com.tcs.tech.domain.repository.FactsRepository
import com.tcs.tech.domain.usecase.facts.GetFactsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    fun providesFactsUseCase(repository: FactsRepository): GetFactsUseCase {
        return GetFactsUseCase(repository)
    }

}