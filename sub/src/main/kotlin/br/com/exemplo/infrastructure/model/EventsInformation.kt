package br.com.exemplo.infrastructure.model

data class EventsInformation(
    val events: Events = Events.SAVE_USER,
    val userEvents: UserEvents = UserEvents(null, "","")
)