package com.factory.appraisal.vehiclesearchapp.persistence.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Audited
@Entity
@Table(name = "FACTORY_DB.APR_VEH_TIRE_CONDN")
@DynamicUpdate
@DynamicInsert
@Data
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class FactoryDBAppraisalVehicleTireCondition extends TransactionEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "V_TIRE_CONDN_ID")
    private long vehicleTireConditionId;

    @Column(name = "APR_STATUS_ID")
    private long appraisalStatusId;
    @Column(name = "265_OR_70R18")
    private boolean tireWidth;

    private boolean fourMatch;
    private boolean mismatched;
    @Column(name = "XLNT_TREAD")
    private boolean excellentTread;
    private boolean goodTread;
    private boolean poorTread;
    @Column(name = "NEEDS_RPLC")
    private boolean needsReplacement;
    @Column(name = "F_UNEVEN_WEAR_PTRN")
    private boolean frontUnevenWearPattern;
    @Column(name = "F_TIRES_BAD")
    private boolean frontTiresBad;
    @Column(name = "R_TIRES_BAD")
    private boolean rearTiresBad;

    @Column(name = "NO_SPARE_TIRE")
    private boolean noSpareTire;
    @Column(name = "SPARE_TIRE_ON_VEH")
    private boolean spareTireOnVehicle;
    //private AppraisalTestDriveStatus appraisalTestDriveStatus;
}
