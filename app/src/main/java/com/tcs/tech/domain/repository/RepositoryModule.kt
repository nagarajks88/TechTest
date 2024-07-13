package com.tcs.tech.domain.repository

import com.tcs.tech.data.api.RestService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun providesFactsRepository(service: RestService): FactsRepository {
        return FactsRepositoryImpl(service)
    }

}