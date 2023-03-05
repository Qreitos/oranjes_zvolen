package com.orj.oranjes.model.DTO.response;

import com.orj.oranjes.model.DTO.request.PlayerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AllPlayerDto {

    private List<PlayerDto> allPlayers;

    public void fillPlayersList() {

    }
}
