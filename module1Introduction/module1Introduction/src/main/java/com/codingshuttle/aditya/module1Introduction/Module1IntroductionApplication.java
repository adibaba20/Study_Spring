package com.codingshuttle.aditya.module1Introduction;

import com.codingshuttle.aditya.module1Introduction.impl.EmailNotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {
//	@Autowired
	//PaymentService paymentServiceObj;


//	@Autowired
	NotificationService notificationServiceObj;

	public Module1IntroductionApplication(NotificationService notificationServiceObj)
	{
		this.notificationServiceObj=notificationServiceObj; // constructor DI ??preferred
	}
	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}
        @Override
		public void run(String... args) throws Exception{
		// NotificationService notificationServiceObj=new EmailNotificationService();
		notificationServiceObj.send("hello");
		}

}
