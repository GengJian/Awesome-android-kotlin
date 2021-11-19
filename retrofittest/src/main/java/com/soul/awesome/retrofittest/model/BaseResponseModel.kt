package com.soul.awesome.retrofittest.model

/// Api统一的返回结构
class BaseResponseModel<T>(var code: Int = 0, var message: String? = null) {
    var data: T? = null

    override fun toString(): String {
        return "BaseResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}'
    }

    companion object {
        const val RESPONSE_SUCCESS = 0
        const val RESPONSE_EXCEPTION = -1
    }
}