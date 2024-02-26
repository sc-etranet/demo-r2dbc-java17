package com.example

import jakarta.inject.Singleton
import jakarta.transaction.Transactional
import org.jooq.DSLContext
import reactor.core.publisher.Flux

@Singleton
class SimpleRepository (
    private val dslContext: DSLContext
){
    @Transactional
    fun fetchAll() = Flux.from(dslContext.select().from("settings")).mapNotNull { it.get(1) as String }
}