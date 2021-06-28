package br.com.exemplo.infrastructure.model

import java.util.*

data class UserEvents(
    val id: UUID?,
    val login: String,
    val password: String
)