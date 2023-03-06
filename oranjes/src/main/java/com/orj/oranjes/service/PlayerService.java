package com.orj.oranjes.service;

import com.orj.oranjes.model.entity.Team;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.orj.oranjes.model.DTO.response.PlayerDto;
import com.orj.oranjes.model.entity.Player;
import com.orj.oranjes.repository.PlayerRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerDto transferPlayerToDto(Player player) {
        log.info("Transferring 'Player' object to DTO");
        PlayerDto playerDto = new PlayerDto();
        playerDto.setFirst_name(player.getFirst_name());
        playerDto.setLast_name(player.getLast_name());

        return playerDto;
    }

    public Player getPlayerByTeam(Team team) {
        log.info("Retrieving 'Player' data from database");
        return playerRepository.getPlayerByTeam(team);
    }

    public void savePlayer(Player player) {
        log.info("Saving 'Player' object to database");
        playerRepository.save(player);
    }
}
