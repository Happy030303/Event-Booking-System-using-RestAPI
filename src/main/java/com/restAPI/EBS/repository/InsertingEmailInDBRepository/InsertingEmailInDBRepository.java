package com.restAPI.EBS.repository.InsertingEmailInDBRepository;

import com.restAPI.EBS.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InsertingEmailInDBRepository extends JpaRepository<Email, Integer>
{

    @Query("select email from Email email where email.email LIKE LOWER(CONCAT('%', ?1, '%'))")
    Email findByEmail(String email);
}
