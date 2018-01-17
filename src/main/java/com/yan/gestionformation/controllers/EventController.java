package com.insat.gestionformation.controllers;

import com.insat.gestionformation.models.Event;
import com.yan.gestionformation.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class EventController {
@Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    EventService eventService;
    @RequestMapping(value = "/addevent", method = RequestMethod.GET)
    public String addevent(Event event){
        return "addevent";
    }

    @RequestMapping(value = "/addevent", method = RequestMethod.POST)
    public String addNewEvent(@Valid Event event, BindingResult bindingResult, Model model){
        model.addAttribute("name", event.getName());
        model.addAttribute("capacity", event.getCapacity());
        model.addAttribute("description", event.getDescription());
        eventService.saveEvent(event);
        return "result";
    }
}
