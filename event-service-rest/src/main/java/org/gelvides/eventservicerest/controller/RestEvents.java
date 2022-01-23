package org.gelvides.eventservicerest.controller;

import entityDto.EventDTO;
import org.gelvides.eventserviceimpl.services.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/events/")
@ComponentScan("org.gelvides.eventserviceimpl")
public class RestEvents {
    @Autowired
    EventServiceImpl eventServiceImpl;

    @GetMapping("events")
    public List<EventDTO> getAllEvents(){
        return eventServiceImpl.getAllEvents();
    }

    @GetMapping("events-by-title/{title}")
    public List<EventDTO> getAllEventByTitle(@PathVariable String title){
        return eventServiceImpl.getAllEventByTitle(title);
    }

    @PostMapping("save")
    public String saveEvent(@RequestBody EventDTO eventDTO){
        eventServiceImpl.createEvent(eventDTO);
        return "Event successfully saved";
    }

    @PutMapping("edit/{id}")
    public String editEvent(@PathVariable long id,
                            @RequestBody EventDTO eventDTO){
        eventServiceImpl.updateEvent(id, eventDTO);
        return "Event successfully edited";
    }

    @DeleteMapping("delete/{id}")
    public String deleteEvent(@PathVariable long id){
        eventServiceImpl.deleteEvent(id);
        return "Event successfully deleted";
    }


}
