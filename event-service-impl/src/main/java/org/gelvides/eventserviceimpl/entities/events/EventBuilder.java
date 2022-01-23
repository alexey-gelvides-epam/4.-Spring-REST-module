package org.gelvides.eventserviceimpl.entities.events;

import entityDto.EventDTO;
import org.springframework.stereotype.Component;

@Component
public class EventBuilder {

    public Event eventDtoToEvent(EventDTO eventDTO){
        return new Event()
                .setTitle(eventDTO.getTitle())
                .setPlace(eventDTO.getPlace())
                .setSpeaker(eventDTO.getSpeaker())
                .setEventType(eventDTO.getEventType())
                .setDateTime(eventDTO.getDateTime());
    }

    public EventDTO eventToEventDto(Event event){
        return new EventDTO().setId(event.getId())
                .setTitle(event.getTitle())
                .setPlace(event.getPlace())
                .setSpeaker(event.getSpeaker())
                .setEventType(event.getEventType())
                .setDateTime(event.getDateTime());
    }

    public Event updateEventFromEventDTO(Event event, EventDTO eventDTO){
        return event
                .setTitle(eventDTO.getTitle())
                .setPlace(eventDTO.getPlace())
                .setSpeaker(eventDTO.getSpeaker())
                .setEventType(eventDTO.getEventType())
                .setDateTime(eventDTO.getDateTime());
    }
}
