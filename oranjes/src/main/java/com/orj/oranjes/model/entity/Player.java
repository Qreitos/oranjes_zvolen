package com.orj.oranjes.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Table
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String birth_date;
    private String address;
    private String email;
    private String number;
    private String position;
    private String img;

    @OneToOne
    private Parents parents;
    @ManyToOne
    private Team team;
}
