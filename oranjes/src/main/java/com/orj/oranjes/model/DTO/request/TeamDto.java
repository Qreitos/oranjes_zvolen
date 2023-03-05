package com.orj.oranjes.model.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.orj.oranjes.model.entity.Player;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamDto {

    private String name;
    private List<Player> players;
}
