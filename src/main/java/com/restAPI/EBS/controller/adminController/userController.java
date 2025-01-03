package com.restAPI.EBS.controller.adminController;

import com.restAPI.EBS.model.EventDetail;
import com.restAPI.EBS.model.PaymentDetail;
import com.restAPI.EBS.model.Ticket;
import com.restAPI.EBS.model.UsersEntity;
import com.restAPI.EBS.service.EventService;
import com.restAPI.EBS.service.PaymentService;
import com.restAPI.EBS.service.TicketService;
import com.restAPI.EBS.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class userController
{
    @Autowired
    private UsersService service;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private EventService eventService;
    @Autowired
    private TicketService ticketService;

//////////////////////////////////////////////////////////////////////////////////////////////////
    // event

    @PostMapping("/addevent") // adding event detail in db
    public String addEvent(@RequestBody List<EventDetail> eventList)
    {
        return eventService.addEventDetailInDB(eventList);
    }

    @GetMapping("/getevent")
    public List<EventDetail> event()
    {
        return eventService.getEventDetail();
    }

/////////////////////////////////////////////////////////////////////////////////////////////
    // payment

    @PostMapping("/addpayment") // adding paypment detail in db
    public String addPayment(@RequestBody List<PaymentDetail> paymentDetailList)
    {
        return paymentService.addPaymentInDB(paymentDetailList);
    }

    @GetMapping("/getpayment")  // gettting all payment detail in db
    public List<PaymentDetail> payment()
    {
        return paymentService.getPaymentDetail();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    //ticket

    @PostMapping("/addticket")
    public String addTicket(@RequestBody List<Ticket> ticketList)
    {
        return ticketService.addTicketInDB(ticketList);
    }

    @GetMapping("/getticket")
    public List<Ticket> getTicket()
    {
       return ticketService.getAllTicketDetail();
    }

///////////////////////////////////////////////////////////////////////////////////////////////
    // user

    @PostMapping("/adduser")
    public void add(@RequestBody List<UsersEntity> usersList)
    {
        service.addUsersDetail(usersList);
    }

    @GetMapping("/getuser")
    public List<UsersEntity> get()
    {
        return service.getAllDetails();
    }

    @GetMapping("/getuser/{user}")
    public List<UsersEntity> get(@PathVariable("user") String username)
    {
        return service.getSpecificUserDetail(username);
    }
}
