package com.homework.module1;

import org.springframework.stereotype.Component;

@Component
public class strawberryFrosting implements Frosting {
    public String getFrostingType() {
        return "strawberry frosting";
    }
}
