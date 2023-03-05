package com.orj.oranjes.service;

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

    public PlayerDto getDto(Player player) {

        PlayerDto playerDto = new PlayerDto();
        playerDto.setName(player.getName());
        playerDto.setImg(player.getImg());
        playerDto.setPosition(player.getPosition());
        playerDto.setNumber(player.getNumber());

        return playerDto;
    }
}
