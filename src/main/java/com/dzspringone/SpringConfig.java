package com.dzspringone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration                                          //Аннотация, которая говорит что данный класс является конфигурацией
@ComponentScan("com.dzspringone")                       //Пакет, в котором спринг будет искать бины
@PropertySource("classpath:money.properties")          //Файл в папке resources, отвечающий за конфиг каких-то полей
public class SpringConfig {

    @Bean
    public Wallet wallet() {
        return new Wallet();
    }

    @Bean
    public Money dollars(@Value("${money.dollars}") double dollars) {
        return new Money(dollars, new Dollars());
    }

    @Bean
    public Money euros(@Value("${money.euros}") double euros) {
        return new Money(euros, new Euros());
    }

    @Bean
    public Money rubles(@Value("${money.rubles}") double rubles) {
        return new Money(rubles, new Rubles());
    }

    @Bean
    public Money pesos(@Value("${money.pesos}") double pesos) {
        return new Money(pesos, new Pesos());
    }
}
