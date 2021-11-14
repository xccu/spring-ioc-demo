package com.example.ioc.auto;

import org.springframework.stereotype.Component;

@Component
public class Wolffy implements User {

    @Override
    public String getName() {
        return "Wolffy";
    }

    @Override
    public String getRace() {
        return "Lupo";
    }
}
