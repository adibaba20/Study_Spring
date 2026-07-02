package com.codingshuttle.aditya.module1Introduction;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
@Component
public class PaymentService {
    public void pay()
    {
        System.out.println("paying");
    }

    @PostConstruct
    public void afterinitttt()

    {
        System.out.println("Before paying......");

    }
    @PreDestroy
    public void beforeDestory()
    {
        System.out.println("After payment is done");
    }


}
