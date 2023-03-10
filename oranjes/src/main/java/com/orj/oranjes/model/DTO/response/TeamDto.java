package com.orj.oranjes.model.DTO.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamDto {

    private String name;
    private List<PlayerDto> players = new ArrayList<>();

    public void addPlayerDto(PlayerDto playerDto) {
        this.players.add(playerDto);
    }
}
