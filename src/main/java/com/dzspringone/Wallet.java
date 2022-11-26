package com.dzspringone;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class Wallet {
    @Autowired
    List<Money> money;

    public void showBalance() {
        for (Money money: money) {
            System.out.println(money.getCurrency().getCurrencyName() + " : " + money.getCount());
        }
    }
}
