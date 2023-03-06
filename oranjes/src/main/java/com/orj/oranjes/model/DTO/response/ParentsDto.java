package com.orj.oranjes.model.DTO.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParentsDto {

    private String mother_name;
    private String mother_address;
    private String mother_email;
    private String mother_mobile;
    private String father_name;
    private String father_address;
    private String father_email;
    private String father_mobile;
}
