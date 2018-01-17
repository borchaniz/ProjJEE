package com.yan.gestionformation.Services;
import com.insat.gestionformation.models.Event;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service("eventService")
public interface EventService  {
    public void saveEvent(Event  event);
}
