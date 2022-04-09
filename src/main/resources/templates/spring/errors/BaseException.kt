package #{PackageName}.errors

import #{PackageName}.errors.payload.PayLoadError
import java.lang.RuntimeException

abstract class BaseException(
    override val message: String? = null,
    private val payload: Any?
): RuntimeException(message) {
    fun getPayloadResponse(): PayLoadError {
        return PayLoadError(message, payload)
    }

    abstract fun getCode(): Int
}