package entityDto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class EventDTO {
    private long id;
    private String title;
    private int place;
    private String speaker;
    private String eventType;
    private Date dateTime;

}
