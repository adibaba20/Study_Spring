package com.homework.module1;

import org.springframework.stereotype.Component;

@Component
public class strawberrySyrup implements syrup {
    public String getSyrupType() {
        return "strawberry syrup";
    }
}