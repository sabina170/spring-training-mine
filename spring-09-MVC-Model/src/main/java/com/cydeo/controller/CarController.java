package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
//1st way: quere parameter
    //localhost:8080/info?make=Honda
    @RequestMapping("/info") // end point
    public String carInfo(@RequestParam String make, Model model){

        model.addAttribute("make", make);
        System.out.println(make);

        return "car/car-info";  // view
    }



    //localhost:8080/info2 (BMW)
    // default field
    @RequestMapping("/info2") // end point
    public String carInfo2(@RequestParam(value="make", required = false, defaultValue = "BMW") String car, Model model){

        model.addAttribute("make", car);
        System.out.println(car);

        return "car/car-info";  // view
    }




    //localhost:8080/info3?make=Honda&year=2015
    @RequestMapping("/info3") // end point
    public String carInfo3(@RequestParam String make, @RequestParam int year,Model model){

        model.addAttribute("make", make);
        model.addAttribute("year", year);
        System.out.println(make);

        return "car/car-info";  // view
    }


    //2nd way : pat variable
    //localhost:8080/info/ (honda) (nissan) (bmw) - dynamic data
    @RequestMapping("/info/{make}/{year}")
    public String getCarInfo(@PathVariable String make, @PathVariable int year) {

        System.out.println(make);
        System.out.println(year);
        return "car/car-info";
    }

}
