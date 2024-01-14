package com.trader.tcgtrader.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InitialView {
    
    @GetMapping({"", "/"})//load the first page a user sees when they come to the site
    public String initialPage(Model model){
        return "initialView";
    }
}
