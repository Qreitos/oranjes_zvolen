package com.orj.oranjes.controller;

import com.orj.oranjes.model.DTO.response.PlayerDto;
import com.orj.oranjes.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TeamsController {

    private final TeamService teamService;

    @RequestMapping(value = "/team", method = RequestMethod.GET)
    public String getU15TeamPage(Model model) {
        List<PlayerDto> playerDtoList = teamService.
                getTeamDto(teamService.getTeamByName("U15")).getPlayers();
        int playerCount = playerDtoList.size();

        model.addAttribute("players", playerDtoList);
        model.addAttribute("playerCount", playerCount);

        return "u15";
    }
}
