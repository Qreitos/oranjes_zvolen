package com.orj.oranjes.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class TeamsController {

    @RequestMapping(value = "/u15", method = RequestMethod.GET)
    public String getU15TeamPage(Model model) {

        return "u15";
    }
}
