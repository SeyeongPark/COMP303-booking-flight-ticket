package com.spring.jpa;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReservationController {

       @Autowired
       private ReservationRepository rsvRepository;

       @RequestMapping("/new-reservation")
   	public String newFlightReservation(Model model) {
   		Reservation reservation = new Reservation();
   		model.addAttribute("reservation", reservation);
   		return "new-reservation";
   	}

       // save new flight reservation
       @PostMapping( "/save")
   	public @ResponseBody ModelAndView save(
       		@RequestParam("flightcode") int flightcode,
            @RequestParam("airlinename") String airlinename,
            @RequestParam("fare") String fare,
			@RequestParam("departuredate") Date departuredate,
			@RequestParam("departurecity") String departurecity,
			@RequestParam("arrivaldate") Date arrivaldate,
			@RequestParam("destination") String destination,
			@RequestParam("numadult") int numadult,
			@RequestParam("numchild") int numchild)

       {
    	   Reservation reservation=new Reservation(flightcode,airlinename,fare,departuredate,departurecity,arrivaldate,destination,numadult,numchild);
    	   rsvRepository.save(reservation);
    	    ModelAndView paymentview = new ModelAndView("payment");

           return paymentview;
       }
       
       // show the list of all reservations
       @RequestMapping("/show-reservation")
       public String show(Model model)
       {
           model.addAttribute("reservations", rsvRepository.findAll());
           return "show-reservation";
       }
       
       
}