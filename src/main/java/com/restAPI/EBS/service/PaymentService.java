package com.restAPI.EBS.service;

import com.restAPI.EBS.model.PaymentDetail;
import com.restAPI.EBS.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService
{
    @Autowired
    private PaymentRepository repo;

    public List<PaymentDetail> getPaymentDetail()
    {
        return repo.findAll();
    }

    public String addPaymentInDB(List<PaymentDetail> paymentDetailList)
    {
        repo.saveAll(paymentDetailList);
        return "Payment Added In DB";
    }
}
