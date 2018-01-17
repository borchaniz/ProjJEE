package com.yan.gestionformation.Services;

import com.yan.gestionformation.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service("eventService")
public class EventServiceImpl implements EventService{
    private EventRepository eventRepository;
    @Autowired
    public void setEventRepo(EventRepository eventRepository){
        this.eventRepository=eventRepository;
    }
    @Bean
    public void saveEvent(com.insat.gestionformation.models.Event event){
        eventRepository.save(event);
    }

}
