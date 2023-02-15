package com.factory.appraisal.vehiclesearchapp.persistence.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Audited
@Entity
@Table(name = "FACTORY_DB.CONFIG_CODES")
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "id", column = @Column(name = "CODE_ID"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class FactoryDBConfigCodes extends TransactionEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String codeType;
    private String shortCode;
    private String longCode;
    private String shortDescription;

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getLongCode() {
        return longCode;
    }

    public void setLongCode(String longCode) {
        this.longCode = longCode;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

}
