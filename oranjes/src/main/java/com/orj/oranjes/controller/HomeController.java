package com.orj.oranjes.controller;

import com.orj.oranjes.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final TeamService teamService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHomePage(Model model) {
        model.addAttribute("teams", teamService.getAllTeamsDtos());
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
