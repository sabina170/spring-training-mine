package com.cydeo.controller;

import com.cydeo.bootrsrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register") // localhost:9090/student/register
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }

    @RequestMapping("/welcome") // localhost:9090/student/welcome?name=Sabina
    public String welcome(@RequestParam String name){
        System.out.println(name);

        return "student/welcome";
    }
}
