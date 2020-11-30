package kotlinapi.kotlinApi.repository

import kotlinapi.kotlinApi.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository :  JpaRepository<Product, String>{

}