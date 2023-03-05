package com.orj.oranjes.service;

import com.orj.oranjes.model.DTO.response.PlayerDto;
import com.orj.oranjes.model.DTO.response.TeamDto;
import com.orj.oranjes.model.entity.Player;
import com.orj.oranjes.model.entity.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.orj.oranjes.repository.TeamRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;
    private final PlayerService playerService;

    public Team getTeamByName(String name) {
        return teamRepository.getTeamByName(name);
    }

    public TeamDto transferTeamToDto(Team team) {
        List<PlayerDto> players = new ArrayList<>();

        for (Player player : team.getPlayers()) {
            players.add(playerService.transferPlayerToDto(player));
        }

        TeamDto teamDto = new TeamDto();
        teamDto.setName(team.getName());

        for (PlayerDto playerDto : players) {
            teamDto.addPlayerDto(playerDto);
        }

        return teamDto;
    }
}
