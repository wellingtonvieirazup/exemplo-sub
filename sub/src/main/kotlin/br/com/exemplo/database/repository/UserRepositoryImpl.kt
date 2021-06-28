package br.com.exemplo.database.repository

import br.com.exemplo.core.model.User
import br.com.exemplo.database.entity.UserEntity
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import java.util.*
import javax.inject.Singleton

@Singleton
class UserRepositoryImpl( private val session: CqlSession): UserRepoInterface {
    override fun save(userEntity: UserEntity): UserEntity {
        session.execute(
            SimpleStatement.newInstance(
                "INSERT INTO exemplo.User(id,login,password) VALUES (?,?,?)",
                UUID.randomUUID(),
                userEntity.login,
                userEntity.password,
            )
        )
        return userEntity
    }
}