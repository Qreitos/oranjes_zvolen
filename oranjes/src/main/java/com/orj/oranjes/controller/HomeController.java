package com.orj.oranjes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHome() {
        return "index";
    }

    @RequestMapping(value = "/2percenta", method = RequestMethod.GET)
    public String getMore() {
        return "2percenta";
    }
}
