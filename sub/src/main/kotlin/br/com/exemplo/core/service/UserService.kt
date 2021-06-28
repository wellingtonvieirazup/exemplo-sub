package br.com.exemplo.core.service

import br.com.exemplo.core.mapper.UserConverter
import br.com.exemplo.core.model.User
import br.com.exemplo.core.ports.UserEntityServicePort
import br.com.exemplo.core.ports.UserServicePort
import javax.inject.Singleton

@Singleton
class UserService(private val service: UserEntityServicePort): UserServicePort {
    override fun insert(user: User) =
        UserConverter.userToUserRequest(service.save(UserConverter.userToUserEntity(user)))
}