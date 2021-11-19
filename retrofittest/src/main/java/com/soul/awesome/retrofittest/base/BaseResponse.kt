package com.soul.awesome.retrofittest.base

class BaseResponse<T>(
    code: Int? = null,
    message: String? = null,
    data: T? = null
) {
    val data = data
}