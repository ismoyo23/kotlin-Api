package kotlinapi.kotlinApi.service.impl

import kotlinapi.kotlinApi.entity.Product
import kotlinapi.kotlinApi.model.CreateProductRequest
import kotlinapi.kotlinApi.model.ProductResponse
import kotlinapi.kotlinApi.repository.ProductRepository
import kotlinapi.kotlinApi.service.ProductService
import kotlinapi.kotlinApi.validation.ValidationUtil
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(
        val productRepository: ProductRepository,
        val validationUtil: ValidationUtil
) : ProductService {
    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        validationUtil.validate(createProductRequest)
        val product = Product(
                id = createProductRequest.id!!,
                name = createProductRequest.name!!,
                quantity = createProductRequest.quantity!!,
                createdAt = Date(),
                updatedAt = null
        )

        productRepository.save(product)
        return ProductResponse(
                id = product.id,
                name = product.name,
                quantity = product.quantity,
                createdAt = product.createdAt,
                updatedAt = product.updatedAt
        )
    }
}