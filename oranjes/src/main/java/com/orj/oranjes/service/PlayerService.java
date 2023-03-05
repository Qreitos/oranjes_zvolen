package com.orj.oranjes.service;

import com.orj.oranjes.model.entity.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.orj.oranjes.model.DTO.response.PlayerDto;
import com.orj.oranjes.model.entity.Player;
import com.orj.oranjes.repository.PlayerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerDto transferPlayerToDto(Player player) {

        PlayerDto playerDto = new PlayerDto();
        playerDto.setName(player.getName());
        playerDto.setImg(player.getImg());
        playerDto.setPosition(player.getPosition());
        playerDto.setNumber(player.getNumber());

        return playerDto;
    }

    public Player getPlayerByTeam(Team team) {
        return playerRepository.getPlayerByTeam(team);
    }

    public void savePlayer(Player player) {
        playerRepository.save(player);
    }
}
