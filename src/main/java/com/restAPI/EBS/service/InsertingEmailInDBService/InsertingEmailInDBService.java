package com.restAPI.EBS.service.InsertingEmailInDBService;

import com.restAPI.EBS.model.Email;
import com.restAPI.EBS.repository.InsertingEmailInDBRepository.InsertingEmailInDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsertingEmailInDBService
{
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private InsertingEmailInDBRepository repo;


    public String addingUserInDB(Email user1)
    {
        user1.setPassword(passwordEncoder.encode(user1.getPassword()));
        repo.save(user1);
        return "Email data is inserted in DB";
    }

    public List<Email> getAllEmailDetail()
    {
        return repo.findAll();
    }
}
