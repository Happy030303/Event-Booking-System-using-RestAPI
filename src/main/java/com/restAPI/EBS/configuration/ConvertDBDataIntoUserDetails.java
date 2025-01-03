package com.restAPI.EBS.configuration;

import com.restAPI.EBS.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.Collections;

@Service
public class ConvertDBDataIntoUserDetails implements UserDetails
{
    @Autowired
    private Email email;

    public ConvertDBDataIntoUserDetails(Email email)
    {
        this.email = email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        String assignedRole = email.getRole();   // we will get the role of email which is assigned in DB
        return Collections.singleton(new SimpleGrantedAuthority(assignedRole)); // assign user a role which is assigned in database.
    }

    @Override
    public String getPassword()
    {
        return email.getPassword();
    }

    @Override
    public String getUsername()
    {
        return email.getEmail();
    }
}
