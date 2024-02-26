package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/simple")
class SimpleController(
    private val simpleRepository: SimpleRepository
) {

    @Get
    fun fetchAll() =
        simpleRepository.fetchAll()

}