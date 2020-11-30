package kotlinapi.kotlinApi.model

import java.util.*
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank

data class CreateProductRequest  (

        @field:NotBlank
        val id: String?,

        @field:NotBlank
        val name: String?,

        @field:NotBlank
        @field:Min(0)
        val quantity:Int?,
)