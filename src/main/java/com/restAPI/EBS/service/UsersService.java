package com.restAPI.EBS.service;

import com.restAPI.EBS.model.UsersEntity;
import com.restAPI.EBS.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService
{
    @Autowired
    private UsersRepository repo;

    public void addUsersDetail(List<UsersEntity> usersList)
    {
        repo.saveAll(usersList);
    }

    public List<UsersEntity> getAllDetails()
    {
        return repo.findAll();
    }

    public List<UsersEntity> getSpecificUserDetail(String username)
    {
        return repo.findByUsername(username);
    }
}
