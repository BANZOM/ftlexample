package com.banzo.ftlexample.ftlexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PracticeController {

    @GetMapping("/practice")
    public String getMethodName(Model model) {

        String username = "Banzo";
        model.addAttribute("username", username);

        int quantity = 5;
        double price = 10.5;
        model.addAttribute("quantity", quantity);
        model.addAttribute("price", price);

        boolean isAdmin = true;
        model.addAttribute("isAdmin", isAdmin);

        //loops
        String[] fruits = {"apple", "banana", "orange"};
        model.addAttribute("fruits", fruits);

        return "practice";
    }
    
}
