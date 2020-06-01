package com.Tourisme.microTourisme.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin("*")
@Controller
public class ParticipationController {

    @RequestMapping("/Welcome")

    public String Welcome(){
        return "Welcome page";
    }
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String homepage(){
        return "index";
    }
}
