package br.com.exemplo.core.mapper

import br.com.exemplo.core.model.User
import br.com.exemplo.database.entity.UserEntity
import br.com.exemplo.infrastructure.model.UserEvents
import java.util.*

class UserConverter {
    companion object {
            //fun userRequestToUser(userRequest: UserRequest) =
            //    User(UUID.randomUUID(),userRequest.login, userRequest.password)

            fun userEventToUser(userEvent: UserEvents) =
                User(userEvent.id,userEvent.login, userEvent.password)

            fun userToUserRequest(user: User) = UserEvents(user.id,user.login, user.password)

            fun userToUserEntity(user: User) = UserEntity(user.id, user.login, user.password)

            //fun userToUserEvent(user: User) = UserEvents(user.id, user.login, user.password)

            fun userEntityToUser(userEntityResult: UserEntity) = User(userEntityResult.id, userEntityResult.login, userEntityResult.password)

    }
}
