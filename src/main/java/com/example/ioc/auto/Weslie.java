package com.example.ioc.auto;

import org.springframework.stereotype.Component;

@Component
public class Weslie implements User{

    @Override
    public String getName(){
        return "Weslie";
    }

    @Override
    public String getRace(){
        return "Caprinae";
    }
}
