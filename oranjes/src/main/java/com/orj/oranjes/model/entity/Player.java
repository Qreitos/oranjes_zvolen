package com.orj.oranjes.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String first_name;
    private String last_name;
    private String birth_date;
    private String personal_number;
    private String nationality;
    private String email;
    private String number;

    @OneToOne
    private Parents parents;
    @ManyToOne
    private Team team;
}
