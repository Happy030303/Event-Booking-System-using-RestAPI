package com.restAPI.EBS.repository;


import com.restAPI.EBS.model.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Integer>
{

    @Query("select user from UsersEntity user where user.username LIKE LOWER(CONCAT('%', ?1, '%'))")
    List<UsersEntity> findByUsername(String username);

    @Query("select user from UsersEntity user where user.username LIKE LOWER(CONCAT('%', ?1, '%'))")
    UsersEntity findADetailUsingUsername(String username);
}
