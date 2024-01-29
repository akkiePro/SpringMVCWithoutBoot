package com.akki.SpringMVCWithoutBoot.controller;

import com.akki.SpringMVCWithoutBoot.dao.AlienDao;
import com.akki.SpringMVCWithoutBoot.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private AlienDao dao;

    @ModelAttribute
    public void modelData(Model m) {
        m.addAttribute("name", "Akkieans");
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien, Model m) {
        return "result";
    }

    @GetMapping("getAliens")
    public String getAliens(Model m) {
        m.addAttribute("result", dao.getAliens());
        return "showAliens";
    }
}
