package com.orj.oranjes.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table
@NoArgsConstructor
public class Parents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String mother_name;
    private String mother_address;
    private String mother_email;
    private String mother_mobile;
    private String father_name;
    private String father_address;
    private String father_email;
    private String father_mobile;

    @OneToOne
    private Player player;
}
