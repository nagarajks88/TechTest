package com.tcs.tech.domain.usecase.facts

import com.tcs.tech.data.model.FactsResponse
import com.tcs.tech.data.util.Resource
import com.tcs.tech.domain.repository.FactsRepository


class GetFactsUseCase(
    private val factsRepository: FactsRepository
) {

    suspend fun execute(): Resource<FactsResponse> {
        return factsRepository.getFacts()
    }
}