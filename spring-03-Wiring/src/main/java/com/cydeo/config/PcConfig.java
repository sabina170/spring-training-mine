package com.cydeo.config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.casefactory.Dimensions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PcConfig {

    @Bean
    public Dimensions dimensions(){
        return new Dimensions(50,10,10);
    }

    //1st way of achieving  wiring injection - by using method parameter:
    @Bean
    public Case caseDell(Dimensions dimensions){
        return new DellCase("220B","Dell","240",dimensions);
    }

    //2nd way of achieving wiring injection - by using method call:
//    @Bean
//    public Case caseDell(){
//        return new DellCase("220B","Dell","240",dimensions());
//    }



}