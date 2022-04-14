package com.example.spring09thymeleaf.controller;

import com.example.spring09thymeleaf.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping ("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String showForm(Model model){


        List<String> batchList = Arrays.asList("JD1","JD2","JD3","JD4");
        model.addAttribute("batchList", batchList);
        //create an empty object to save data to
        model.addAttribute("mentor", new Mentor());
        return  "mentor/mentor-register";
    }

    @PostMapping("/confirm")
    public String showForm2(@ModelAttribute("mentor") Mentor mentor){

        System.out.println(mentor.toString());

         return "redirect:/mentor/register";
    }
}
