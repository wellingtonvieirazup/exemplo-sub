package br.com.exemplo.database.service

import br.com.exemplo.core.mapper.UserConverter
import br.com.exemplo.core.model.User
import br.com.exemplo.core.ports.UserEntityServicePort
import br.com.exemplo.database.entity.UserEntity
import br.com.exemplo.database.repository.UserRepoInterface
import javax.inject.Singleton

@Singleton
class UserEntityService(private val userRepoInterface: UserRepoInterface): UserEntityServicePort {
    override fun save(userEntity: UserEntity): User {

        val userEntityResult = userRepoInterface.save(userEntity)

        return UserConverter.userEntityToUser(userEntityResult)
    }
}