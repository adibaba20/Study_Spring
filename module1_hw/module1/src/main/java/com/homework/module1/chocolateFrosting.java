package com.homework.module1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
public class chocolateFrosting implements Frosting {
    public String getFrostingType() {
        return "chocolate frosting";
    }
}
