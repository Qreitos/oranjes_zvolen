package com.orj.oranjes.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Table
@NoArgsConstructor
public class Parents {

    @Id
    private UUID id = UUID.randomUUID();
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
