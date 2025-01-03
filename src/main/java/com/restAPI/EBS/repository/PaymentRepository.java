package com.restAPI.EBS.repository;

import com.restAPI.EBS.model.PaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentDetail, Integer>
{

}
