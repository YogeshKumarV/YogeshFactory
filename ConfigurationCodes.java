package com.factory.appraisal.vehiclesearchapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigurationCodes {
    @Size(max = 15)
    @NotNull
    private String codeType;
    @Size(max = 20)
    @NotNull
    private String shortCode;
    @Size(max = 30)
    @NotNull
    private String longCode;
    @Size(max = 50)
    @NotNull
    private String shortDescription;
}
