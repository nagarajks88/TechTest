package com.tcs.tech.domain.repository

import com.tcs.tech.data.util.Resource
import com.nsk.poc.data.util.handleRequest
import com.tcs.tech.data.api.RestService
import com.tcs.tech.data.model.FactsResponse


interface FactsRepository {
    suspend fun getFacts() : Resource<FactsResponse>
}

class FactsRepositoryImpl(
    private val service: RestService
) : FactsRepository {

    override suspend fun getFacts(): Resource<FactsResponse> {
        return handleRequest { service.getFacts() }
    }

}