package br.com.exemplo.core.ports

import br.com.exemplo.core.model.User
import br.com.exemplo.database.entity.UserEntity
import javax.inject.Singleton

@Singleton
interface UserEntityServicePort {
    fun save(userEntity: UserEntity): User
}
