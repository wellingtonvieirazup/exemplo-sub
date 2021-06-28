package br.com.exemplo.database.repository

import br.com.exemplo.database.entity.UserEntity
import javax.inject.Singleton

@Singleton
interface UserRepoInterface {
    fun save(userEntity: UserEntity): UserEntity
}