package org.gelvides.eventserviceimpl.services;

import entityDto.EventDTO;
import org.gelvides.eventserviceimpl.entities.events.EventBuilder;
import org.gelvides.eventserviceimpl.entities.events.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.EventService;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    EventRepository eventRepository;
    @Autowired
    EventBuilder eventBuilder;

    @Override
    public void createEvent(EventDTO eventDTO) {
        eventRepository.save(eventBuilder.eventDtoToEvent(eventDTO));
    }

    @Override
    public void updateEvent(long id, EventDTO eventDTO) {
        var oldEvent = eventRepository.getById(id);
        eventRepository.save(eventBuilder.updateEventFromEventDTO(oldEvent, eventDTO));
    }

    @Override
    public EventDTO getEvent(long id) {
        var event = eventRepository.getById(id);
        return eventBuilder.eventToEventDto(event);
    }

    @Override
    public void deleteEvent(long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public List<EventDTO> getAllEvents() {
        List<EventDTO> eventDTOS = new ArrayList<>();
        eventRepository.findAll()
                .stream()
                .forEach(event -> eventDTOS.add(eventBuilder.eventToEventDto(event)));
        return eventDTOS;
    }

    @Override
    public List<EventDTO> getAllEventByTitle(String title) {
        List<EventDTO> eventDTOS = new ArrayList<>();
        eventRepository.findEventByTitle(title)
                .stream()
                .forEach(event -> eventDTOS.add(eventBuilder.eventToEventDto(event)));
        return eventDTOS;
    }
}
