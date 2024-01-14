package com.trader.tcgtrader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.trader.tcgtrader.Model.aUser;
import com.trader.tcgtrader.Repos.UserRepo;

import jakarta.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private UserRepo userRepo;

    
    public Populator(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public void run(String... args) throws Exception {
        aUser user1 = new aUser("Brandon", "Burks", "Prince.of.burks@gmail.com", "lol1994", "03/15/1994", "179 dooley woods rd.");
        userRepo.save(user1);
        
    }
    
}
