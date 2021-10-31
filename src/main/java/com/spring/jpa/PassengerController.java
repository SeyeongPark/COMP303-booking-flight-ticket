package com.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PassengerController {

       @Autowired
       private PassengerRepository psgRepository;

       @RequestMapping("/")
       public String home(
//    			  @RequestParam("username") String username,
//    		      @RequestParam("password") String password
    		   )
       {
       return "index";
       }

      @PostMapping("/add")
public @ResponseBody String add(
	  @RequestParam("username") String username,
      @RequestParam("password") String password)
      	{
    	  Passenger passenger=new Passenger(username,password);
    	  psgRepository.save(passenger);
    	  return "An passenger info added";
      	}

      @RequestMapping("/edit-passenger")
      public String Modify()
      {
         return "edit-passenger";
      }

      @PostMapping("/update")
      public @ResponseBody String edit(
    		  @RequestParam("username") String userName,
    	      @RequestParam("password") String password)
    	      
{
    	  Passenger passenger=new Passenger(userName,password);
    	  psgRepository.save(passenger);
      return "updated";
}

      @RequestMapping("/show-passenger")
      public String show(Model model)
      {
      model.addAttribute("passengers", psgRepository.findAll());
      return "show-passenger";
      }
      
//      @RequestMapping("/login")
//      public String login(Model model)
//      {
//      model.addAttribute("passengers", psgRepository.findAll());    
//      return "show-passenger";
//      }
      
     // @RequestMapping(method = RequestMethod.POST)
//      @RequestMapping("/")
//      public String home(Model model,
//    		  @ModelAttribute("Passenger") Passenger passenger) {
//    	  if (passenger != null && passenger.getUserName() != null
//                  & passenger.getPassword() != null) {
//    		  
//    	  
//              if (passenger.getUserName().equals("a@gamil.com")
//                      && passenger.getPassword().equals("password")) {
//                  model.addAttribute("msg", passenger.getUserName());
//                  return "show-passenger.jsp";
//              } else {
//                  model.addAttribute("error", "Invalid Details");
//                  return "index.jsp";
//              }
//          } 
//    	  
//    	  else {
//              model.addAttribute("error", "Please enter Details");
//              return "index.jsp";
//          }
//}
}