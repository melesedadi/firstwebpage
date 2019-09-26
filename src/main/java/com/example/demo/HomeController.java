package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
 @RequestMapping("/")
    public String home(){
     return "home";
 }

    @RequestMapping("/pageone")
    public String pageone(){
        return "pagetwo";
    }
    @RequestMapping("/pagetwo")
    public String pagetwo(){
        return "pagetwo";
    }

    @RequestMapping("/pagethree")
    public String pagethree(){
        return "pagethree";
    }
    @RequestMapping("/grid")
    public String grid(){
        return "grid";
    }
    @RequestMapping("/all")
    public String all (){
        return "all";
    }
}
