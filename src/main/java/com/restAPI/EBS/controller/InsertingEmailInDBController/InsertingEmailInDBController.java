package com.restAPI.EBS.controller.InsertingEmailInDBController;

import com.restAPI.EBS.model.Email;
import com.restAPI.EBS.service.InsertingEmailInDBService.InsertingEmailInDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/db")
public class InsertingEmailInDBController
{
    @Autowired
    private InsertingEmailInDBService service;

    @GetMapping("/add")
    public String printing()
    {
        Email user1 = new Email(2,"karan@gmail.com","karan", "ROLE_USER");
        // pass list if you want to add a list in DB

        return service.addingUserInDB(user1);
    }

    @GetMapping("/get")
    public List<Email> getDetail()
    {
        return service.getAllEmailDetail();
    }


}
