package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;

import javax.print.Doc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{number}")
    @ResponseBody
    public Doctor doctor(@PathVariable int number) {
        if (number ==13) {
            Doctor doctor = new Doctor(13, "Jodie Whittaker");
            return doctor;
        } else 

        return null;
    }
}
