package com.restAPI.EBS.controller.publicController;


import com.restAPI.EBS.model.EventDetail;
import com.restAPI.EBS.model.UsersEntity;
import com.restAPI.EBS.service.EventService;
import com.restAPI.EBS.service.InsertingEmailInDBService.InsertingEmailInDBService;
import com.restAPI.EBS.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public")
public class publicController
{
    @Autowired
    private EventService service;
    @Autowired
    private InsertingEmailInDBService emailService;


    // Event
   



}
