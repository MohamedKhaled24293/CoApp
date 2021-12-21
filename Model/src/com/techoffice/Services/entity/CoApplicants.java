package com.techoffice.Services.entity;

import java.io.Serializable;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * To create ID generator sequence "CO_APPLICANTS_ID_SEQ_GEN":
 * CREATE SEQUENCE "CO_APPLICANTS_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({ @NamedQuery(name = "CoApplicants.findAll", query = "select o from CoApplicants o") })
@Table(name = "CO_APPLICANTS")
@SequenceGenerator(name = "CoApplicants_Id_Seq_Gen", sequenceName = "CO_APPLICANTS_SEQ", allocationSize = 1,
                   initialValue = 1)
public class CoApplicants implements Serializable {
    private static final long serialVersionUID = 886459369371992414L;

    private String address;
    @Column(name = "ADDRESS_STATE_ID")
    private Long addressStateId;
    private Long age;
    @Column(name = "APPLICANT_TYPE_ID")
    private Long applicantTypeId;
    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DATE")
    private Date birthDate;
    @Column(name = "BIRTH_STATE", length = 150)
    private String birthState;
    @Column(name = "BIRTH_STATE_ID")
    private Long birthStateId;
    @Column(name = "COUNTRY_ID")
    private Long countryId;
    @Column(name = "CREATED_BY", length = 100)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(length = 50)
    private String email;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CoApplicants_Id_Seq_Gen")
    private Long id;
    @Column(name = "LAWYER_ATTORNEY_ENTITY", length = 200)
    private String lawyerAttorneyEntity;
    @Column(name = "LAWYER_ATTORNEY_NUMBER")
    private Long lawyerAttorneyNumber;
    @Column(name = "LAWYER_CARD_NUMBER")
    private Long lawyerCardNumber;
    @Column(name = "LAWYER_NAME")
    private String lawyerName;
    @Column(name = "MOBILE_NUMBER", length = 50)
    private String mobileNumber;
    private String name;
    @Column(name = "NATIONAL_NUMBER")
    private Long nationalNumber;
    private Long nationality;
    @Column(name = "NATIONALITY_LKP_ID")
    private Long nationalityLkpId;
    @Column(name = "PASSPORT_NUMBER", length = 20)
    private String passportNumber;
    @Column(name = "PHONE_NUMBER", length = 50)
    private String phoneNumber;
//    @Column(name = "REQUEST_ID")
//    private Long requestId;
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "REQUEST_ID")
    private CoRequest coRequest;
    @Column(name = "SEX_LKP_ID")
    private Long sexLkpId;
    @Column(name = "UPDATED_BY", length = 100)
    private String updatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;
    @Column(name = "WORK_ADDRESS")
    private String workAddress;

    public CoApplicants() {
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAddressStateId() {
        return addressStateId;
    }

    public void setAddressStateId(Long addressStateId) {
        this.addressStateId = addressStateId;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getApplicantTypeId() {
        return applicantTypeId;
    }

    public void setApplicantTypeId(Long applicantTypeId) {
        this.applicantTypeId = applicantTypeId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public Long getBirthStateId() {
        return birthStateId;
    }

    public void setBirthStateId(Long birthStateId) {
        this.birthStateId = birthStateId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getLawyerAttorneyEntity() {
        return lawyerAttorneyEntity;
    }

    public void setLawyerAttorneyEntity(String lawyerAttorneyEntity) {
        this.lawyerAttorneyEntity = lawyerAttorneyEntity;
    }

    public Long getLawyerAttorneyNumber() {
        return lawyerAttorneyNumber;
    }

    public void setLawyerAttorneyNumber(Long lawyerAttorneyNumber) {
        this.lawyerAttorneyNumber = lawyerAttorneyNumber;
    }

    public Long getLawyerCardNumber() {
        return lawyerCardNumber;
    }

    public void setLawyerCardNumber(Long lawyerCardNumber) {
        this.lawyerCardNumber = lawyerCardNumber;
    }

    public String getLawyerName() {
        return lawyerName;
    }

    public void setLawyerName(String lawyerName) {
        this.lawyerName = lawyerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(Long nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public Long getNationality() {
        return nationality;
    }

    public void setNationality(Long nationality) {
        this.nationality = nationality;
    }

    public Long getNationalityLkpId() {
        return nationalityLkpId;
    }

    public void setNationalityLkpId(Long nationalityLkpId) {
        this.nationalityLkpId = nationalityLkpId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    public Long getRequestId() {
//        return requestId;
//    }
//
//    public void setRequestId(Long requestId) {
//        this.requestId = requestId;
//    }

    public Long getSexLkpId() {
        return sexLkpId;
    }

    public void setSexLkpId(Long sexLkpId) {
        this.sexLkpId = sexLkpId;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public void setCoRequest(CoRequest coRequest) {
        this.coRequest = coRequest;
    }

    public CoRequest getCoRequest() {
        return coRequest;
    }
}
