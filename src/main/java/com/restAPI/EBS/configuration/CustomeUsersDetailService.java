package com.restAPI.EBS.configuration;

import com.restAPI.EBS.model.Email;
import com.restAPI.EBS.repository.InsertingEmailInDBRepository.InsertingEmailInDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomeUsersDetailService implements UserDetailsService // to get data from DB and return in "UserDetail" type object;
{
    @Autowired
    private InsertingEmailInDBRepository repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException
    {
        Email email1 = repo.findByEmail(email);
        if(email1 == null)
        {
            System.out.println("Email not found");
            throw new UsernameNotFoundException("Email not found");
        }

        return new ConvertDBDataIntoUserDetails(email1);
    }
}
