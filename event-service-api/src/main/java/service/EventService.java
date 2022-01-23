package service;

import entityDto.EventDTO;

import java.util.List;

public interface EventService {

    void createEvent(EventDTO eventDTO);

    void updateEvent(long id, EventDTO eventDTO);

    EventDTO getEvent(long id);

    void deleteEvent(long id);

    List<EventDTO> getAllEvents();

    List<EventDTO> getAllEventByTitle(String title);
}
