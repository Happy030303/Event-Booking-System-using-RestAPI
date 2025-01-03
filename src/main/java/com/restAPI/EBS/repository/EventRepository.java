package com.restAPI.EBS.repository;

import com.restAPI.EBS.model.EventDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventDetail, Integer>
{

}
