package org.gelvides.eventserviceimpl.entities.events;

import entityDto.EventDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findEventByTitle(String title);
}