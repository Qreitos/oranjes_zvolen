package com.orj.oranjes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewsController {

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public String getNewsPage() {
        return "aktuality";
    }
}