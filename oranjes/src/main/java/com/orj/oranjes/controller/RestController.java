package com.orj.oranjes.controller;

import com.orj.oranjes.model.DTO.request.PlayerDto;
import com.orj.oranjes.model.entity.Player;
import com.orj.oranjes.model.entity.Team;
import com.orj.oranjes.service.PlayerService;
import com.orj.oranjes.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
public class RestController {

    private final TeamService teamService;
    private final PlayerService playerService;

    @RequestMapping(value = "/api/u15", method = RequestMethod.POST)
    public ResponseEntity savePlayerToDatabase(@RequestBody PlayerDto playerDto) {
        Player player = new Player();
        player.setFirst_name(playerDto.getFirst_name());
        player.setLast_name(playerDto.getLast_name());
        playerService.savePlayer(player);

        Team team = teamService.getTeamByName("U15");

        if (team == null) {
            Team newTeam = new Team();
            newTeam.setName("U15");
            newTeam.addPlayer(player);
            teamService.saveTeam(newTeam);
        } else {
            team.addPlayer(player);
            teamService.saveTeam(team);
        }

        return ResponseEntity.accepted().build();
    }
}

