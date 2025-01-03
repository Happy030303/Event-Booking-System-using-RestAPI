package com.restAPI.EBS.service;

import com.restAPI.EBS.model.EventDetail;
import com.restAPI.EBS.repository.EventRepository;
import jdk.jfr.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService
{
    @Autowired
    private EventRepository repo;

    public List<EventDetail> getEventDetail()
    {
        return repo.findAll();
    }

    public String addEventDetailInDB(List<EventDetail> eventList)
    {
        repo.saveAll(eventList);
        return "Event Detail Added";
    }
}
