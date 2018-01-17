package com.yan.gestionformation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  com.insat.gestionformation.models.Event;

@Repository("eventRepository")
public interface EventRepository extends JpaRepository<Event,Integer>{

}
