package com.tcs.tech.data.api

import com.tcs.tech.data.model.FactsResponse
import retrofit2.Response
import retrofit2.http.GET

interface RestService {

    @GET("2iodh4vg0eortkl/facts.json")
    suspend fun getFacts() : Response<FactsResponse>
}