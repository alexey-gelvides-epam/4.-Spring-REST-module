package org.gelvides.eventserviceimpl.entities.events;

import entityDto.EventDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "event")
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "place", nullable = false)
    private int place;
    @Column(name = "speaker", nullable = false)
    private String speaker;
    @Column(name = "eventType", nullable = false)
    private String eventType;
    @Column(name = "date", nullable = false)
    private Date dateTime;
}