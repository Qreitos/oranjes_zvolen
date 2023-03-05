package com.orj.oranjes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHomePage() {
        return "index";
    }

    @RequestMapping(value = "/2percenta", method = RequestMethod.GET)
    public String getMorePage() {
        return "2percenta";
    }

    @RequestMapping(value = "/sponsoring", method = RequestMethod.GET)
    public String getSponsoringPage() {
        return "sponsoring";
    }
}
