package com.orj.oranjes.model.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDto {
    @NotNull
    private String first_name;
    @NotNull
    private String last_name;
}