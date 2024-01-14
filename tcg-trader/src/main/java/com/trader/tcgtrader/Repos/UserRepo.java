package com.trader.tcgtrader.Repos;

import org.springframework.data.repository.CrudRepository;

import com.trader.tcgtrader.Model.aUser;

public interface UserRepo extends CrudRepository<aUser, Long> {
    aUser findUserByEmail(String email);
    aUser findUserById(long id);
}
