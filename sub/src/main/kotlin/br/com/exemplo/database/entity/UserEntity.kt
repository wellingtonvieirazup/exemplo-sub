package br.com.exemplo.database.entity

import io.micronaut.core.annotation.Introspected
import java.util.*

@Introspected
data class UserEntity (
    val id: UUID?,
    val login: String,
    val password: String
)
