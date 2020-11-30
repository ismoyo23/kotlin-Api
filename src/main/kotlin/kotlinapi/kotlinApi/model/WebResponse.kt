package kotlinapi.kotlinApi.model

class WebResponse<T>(
        val code: Int,
        val status: String,
        val data: T
)