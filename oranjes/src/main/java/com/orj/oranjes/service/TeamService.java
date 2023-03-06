package com.orj.oranjes.service;

import com.orj.oranjes.model.DTO.response.PlayerDto;
import com.orj.oranjes.model.DTO.response.TeamDto;
import com.orj.oranjes.model.entity.Player;
import com.orj.oranjes.model.entity.Team;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.orj.oranjes.repository.TeamRepository;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;
    private final PlayerService playerService;

    public Team getTeamByName(String name) {
        log.info("Retrieving 'Team' data from database");
        return teamRepository.getTeamByName(name);
    }

    public TeamDto getTeamDto(Team team) {
        log.info("Transferring 'Team' object to DTO");
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

    public void saveTeam(Team team) {
        log.info("Saving 'Team' object to database");
        teamRepository.save(team);
    }

    public List<TeamDto> getAllTeamsDtos() {
        List<Team> teams = teamRepository.findAll();
        List<TeamDto> teamDtos = new ArrayList<>();

        for (Team team : teams) {
            teamDtos.add(this.getTeamDto(team));
        }
        return teamDtos;
    }
}
