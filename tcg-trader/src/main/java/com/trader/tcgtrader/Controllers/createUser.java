package com.trader.tcgtrader.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trader.tcgtrader.Repos.UserRepo;

import jakarta.annotation.Resource;

@Controller
public class createUser {
    
    @Resource
    private UserRepo userRepo;

    @GetMapping({ "/Register-User" })
    public String registerUser(// request parameters from html page
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam String birthDate,
            @RequestParam String emailAddress,
            @RequestParam String pw) {

                return "";
            };
}
