package com.factory.appraisal.vehiclesearchapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppraisalVehicleTireCondition {
    @Size(max = 15)
    @NotNull
    private long appraisalStatusId;
    @NotNull
    private boolean tireWidth;
    @NotNull
    private boolean fourMatch;
    @NotNull
    private boolean mismatched;
    @NotNull
    private boolean excellentTread;
    @NotNull
    private boolean goodTread;
    @NotNull
    private boolean poorTread;
    @NotNull
    private boolean needsReplacement;
    @NotNull
    private boolean frontUnevenWearPattern;
    @NotNull
    private boolean frontTiresBad;
    @NotNull
    private boolean rearTiresBad;
    @NotNull
    private boolean noSpareTire;
    private boolean spareTireOnVehicle;
    //private AppraisalTestDriveStatus appraisalTestDriveStatus;
}
