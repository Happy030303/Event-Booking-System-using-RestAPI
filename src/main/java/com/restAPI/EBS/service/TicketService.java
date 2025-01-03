package com.restAPI.EBS.service;

import com.restAPI.EBS.model.Ticket;
import com.restAPI.EBS.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService
{
    @Autowired
    private TicketRepository repo;

    public String addTicketInDB(List<Ticket> ticketList)
    {
        repo.saveAll(ticketList);
        return "Ticket added in db";
    }

    public List<Ticket> getAllTicketDetail()
    {
        return repo.findAll();
    }
}
