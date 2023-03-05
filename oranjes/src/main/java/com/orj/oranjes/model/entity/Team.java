package com.orj.oranjes.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Table
@NoArgsConstructor
public class Team {

    @Id
    private UUID id = UUID.randomUUID();
    private String name;

    @OneToMany
    private List<Player> players;
}
