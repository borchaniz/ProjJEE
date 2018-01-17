package com.yan.gestionformation.Configuration;

import com.yan.gestionformation.Services.EventService;
import com.yan.gestionformation.Services.EventServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public EventService getEventService(){
        return new EventServiceImpl();
    }

}
