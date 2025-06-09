package org.example.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        //send request to root of the site
        System.out.println("RUNNING HOME CTRLER");
        return "index.html";
    }
}

