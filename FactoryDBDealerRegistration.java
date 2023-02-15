package com.factory.appraisal.vehiclesearchapp.persistence.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Audited
@Entity
@Table(name = "FACTORY_DB.DEALER_REG")
@DynamicUpdate
@DynamicInsert
@Data
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class FactoryDBDealerRegistration extends TransactionEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  long dealerId;
    private String name;
    private String firstName;
    private String lastName;
    @Column(name ="APT_NUMBER")
    private String ApartmentNumber;
    private String city;
    private String email;
    private String password;
    private String phoneNumber;
    @Column(name = "PROFILE_PIC")
    private String profilePicture;
    private String state;
    private String streetAddress;
    private String zipCode;
    private String latitude;
    private String longitude;
    @Column(name = "TAX_CERT")
    private String taxCertificate;
    @Column(name = "DS_NAME")
    private String dealershipName;
    @Column(name = "DS_ADDR")
    private String dealershipAddress;
    @Column(name = "DS_STREET")
    private String dealershipStreet;
    @Column(name = "DS_CITY")
    private String dealershipCity;
    @Column(name = "DS_ZIP_CODE")
    private String dealershipZipCode;
    @Column(name = "DS_PHONE_NO")
    private String dealershipPhoneNumber;
    @Column(name = "DS_PIC")
    private String dealershipPicture;
    @Column(name = "DS_LIC")
    private String dealershipLicense;
    @Column(name = "CORP_NAME")
    private String corporationName;
    private String codeId;
    private FactoryDBConfigCodes factoryDBConfigCodes;

}
