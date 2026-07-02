package com.homework.module1;

import org.springframework.stereotype.Component;

@Component
public class Baker {
    private final Frosting frosting;
    private final syrup Syrup;
   public Baker(Frosting frosting, syrup syrup)
   {
       this.frosting=frosting;
       this.Syrup = syrup;
   }
   public void bakeCake()
   {
       System.out.println("cake baked with"+ frosting.getFrostingType()+"  and  "+Syrup.getSyrupType());
   }

}
