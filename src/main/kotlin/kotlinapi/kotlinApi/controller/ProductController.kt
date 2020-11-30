package kotlinapi.kotlinApi.controller

import kotlinapi.kotlinApi.model.CreateProductRequest
import kotlinapi.kotlinApi.model.ProductResponse
import org.springframework.web.bind.annotation.RestController
import kotlinapi.kotlinApi.model.WebResponse
import kotlinapi.kotlinApi.service.ProductService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
class ProductController(val productService: ProductService) {

    @PostMapping(
            value = ["/api/products"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun createProduct(@RequestBody body: CreateProductRequest): WebResponse<ProductResponse> {
         val productResponse =  productService.create(body);

        return WebResponse(
                code = 200,
                status = "OK",
                data = productResponse
        )
    }
}