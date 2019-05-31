package com.training.finalexam.finalexam.web;

import org.springframework.web.bind.annotation.*;

import org.springframework.ui.ModelMap;

@RestController
public class IndexController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showIndexPage(ModelMap model) {
        return "index";
    }
}
