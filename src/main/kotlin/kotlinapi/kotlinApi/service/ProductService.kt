package kotlinapi.kotlinApi.service

import kotlinapi.kotlinApi.model.CreateProductRequest
import kotlinapi.kotlinApi.model.ProductResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse
}