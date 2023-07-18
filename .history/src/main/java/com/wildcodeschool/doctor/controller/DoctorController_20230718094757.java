package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{number}")

    @ResponseBody

//     public Doctor doctor(@PathVariable int number) {
//         if (number == 13) {
//             return new Doctor(13, "Jodie Whittaker");
//         } else if (number > 0 && number < 13) {
//             throw new ResponseStatusException(HttpStatus.SEE_OTHER, "303 See Other");
//         } else {
//             throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récuperer l'incarnation " + number);
//         }
//     }
// }

@GetMapping("/doctor/{number}")
    @ResponseBody
    public ResponseEntity doctor(@PathVariable int number) {
        if (number ==13) {
            Doctor doctor = new Doctor(13, "Jodie Whittaker");
            return ResponseEntity.ok(doctor);
        } else if (number >= 1 && number <= 12) {
            return ResponseEntity.status(HttpStatus.SEE_OTHER ).body("303 See Other") ;
        } else {
            return ResponseEntity.notFound().body("Impossible de récuperer l'incarnation " + number);
        }        
    }    
}