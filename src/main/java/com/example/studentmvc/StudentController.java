package com.example.studentmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/")
    public String showHome(Model model) {
        model.addAttribute("student", new Student());
        return "home";
    }

    @PostMapping("/welcome")
    public String showWelcome(@ModelAttribute("student") Student student, Model model) {
        model.addAttribute("student", student);
        return "welcome";
    }
}
