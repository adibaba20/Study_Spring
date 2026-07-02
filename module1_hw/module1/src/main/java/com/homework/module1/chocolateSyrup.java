package com.homework.module1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
public class chocolateSyrup implements syrup {
    public String getSyrupType()
    {
        return "chocolate syrup";
    }
}
