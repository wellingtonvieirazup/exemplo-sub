package br.com.exemplo.core.ports

import br.com.exemplo.core.model.User
import br.com.exemplo.infrastructure.model.UserEvents
import javax.inject.Singleton

@Singleton
interface UserServicePort {
    fun insert(user: User): UserEvents
}
