package com.dzspringone;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DzSpringOneApplication {

    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(SpringConfig.class);

    public static void main(String[] args) {

        Wallet wallet = context.getBean(Wallet.class);

        wallet.showBalance();


        context.close();

    }
}
