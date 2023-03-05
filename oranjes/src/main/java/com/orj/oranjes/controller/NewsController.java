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

    @RequestMapping(value = "/02juniorcup", method = RequestMethod.GET)
    public String getJuniorcupPage() {
        return "02juniorcup";
    }

    @RequestMapping(value = "/06tabory", method = RequestMethod.GET)
    public String get06TaboryPage() {
        return "06tabory";
    }

    @RequestMapping(value = "/03tabor", method = RequestMethod.GET)
    public String get03TaborPage() {
        return "03tabor";
    }

    @RequestMapping(value = "/2022tabor", method = RequestMethod.GET)
    public String get2022TaborPage() {
        return "2022tabor";
    }
}
