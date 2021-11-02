package com.spring.jpa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaymentController {
	    @RequestMapping("/payment")
		public ModelAndView printConfirmation() {
	        ModelAndView paymentview = new ModelAndView("confirmation");
			return paymentview;
		}
	    
	    // get data from payment page and transfer to confirmation page
	    @RequestMapping("/confirmation")
      public ModelAndView confirmation(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView confirmation = new ModelAndView("confirmation");
        String cardName = request.getParameter("cardName");
        Integer cardNum = Integer.parseInt(request.getParameter("cardNum"));
        Integer cardExpiryMM = Integer.parseInt(request.getParameter("cardExpiryMM"));
        Integer cardExpiryYY = Integer.parseInt(request.getParameter("cardExpiryYY"));
        Integer cardCvv = Integer.parseInt(request.getParameter("cardCvv"));
        
        confirmation.addObject("cardName", cardName);
        confirmation.addObject("cardNum", cardNum);
        confirmation.addObject("cardExpiryMM", cardExpiryMM);
        confirmation.addObject("cardExpiryYY", cardExpiryYY);
        confirmation.addObject("cardCvv", cardCvv);

        return confirmation;
      }
	  
		
}
