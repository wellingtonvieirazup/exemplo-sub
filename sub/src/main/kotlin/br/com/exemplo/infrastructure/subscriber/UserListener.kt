package br.com.exemplo.infrastructure.subscriber

import br.com.exemplo.core.mapper.UserConverter
import br.com.exemplo.core.ports.UserServicePort
import br.com.exemplo.core.service.UserService
import br.com.exemplo.infrastructure.model.EventsInformation
import io.micronaut.nats.annotation.NatsListener
import io.micronaut.nats.annotation.Subject
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@NatsListener
class UserListener(private val service: UserServicePort) {

    val LOG: Logger = LoggerFactory.getLogger(UserService::class.java)

    @Subject("my-user")
    fun received(userInformation: EventsInformation){

        LOG.info("message successfully received from the broker {}", userInformation.events.event)
        service.insert(UserConverter.userEventToUser(userInformation.userEvents))
    }
}