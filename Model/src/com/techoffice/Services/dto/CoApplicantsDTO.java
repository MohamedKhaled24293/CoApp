package com.techoffice.Services.dto;


import com.techoffice.Services.entity.CoRequest;

import java.util.Date;


public class CoApplicantsDTO {
    private String address; 
    private Long addressStateId;
    private Long age;
    private Long applicantTypeId;
    private Date birthDate;
    private String birthState;
    private Long birthStateId;
    private Long countryId;
    private String createdBy;
    private Date createdDate;
    private String email;
    private Long id;
    private String lawyerAttorneyEntity;
    private Long lawyerAttorneyNumber;
    private Long lawyerCardNumber;
    private String lawyerName;
    private String mobileNumber;
    private String name;
    private Long nationalNumber;
    private Long nationality;
    private Long nationalityLkpId;
    private String passportNumber;
    private String phoneNumber;
    private CoRequestDTO coRequest;

    public void setCoRequest(CoRequestDTO coRequest) {
        this.coRequest = coRequest;
    }

    public CoRequestDTO getCoRequest() {
        return coRequest;
    }
    private Long sexLkpId;
    private String updatedBy;
    private Date updatedDate;
    private String workAddress;

    public CoApplicantsDTO() {
        coRequest=new CoRequestDTO();
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddressStateId(Long addressStateId) {
        this.addressStateId = addressStateId;
    }

    public Long getAddressStateId() {
        return addressStateId;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getAge() {
        return age;
    }

    public void setApplicantTypeId(Long applicantTypeId) {
        this.applicantTypeId = applicantTypeId;
    }

    public Long getApplicantTypeId() {
        return applicantTypeId;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthStateId(Long birthStateId) {
        this.birthStateId = birthStateId;
    }

    public Long getBirthStateId() {
        return birthStateId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setLawyerAttorneyEntity(String lawyerAttorneyEntity) {
        this.lawyerAttorneyEntity = lawyerAttorneyEntity;
    }

    public String getLawyerAttorneyEntity() {
        return lawyerAttorneyEntity;
    }

    public void setLawyerAttorneyNumber(Long lawyerAttorneyNumber) {
        this.lawyerAttorneyNumber = lawyerAttorneyNumber;
    }

    public Long getLawyerAttorneyNumber() {
        return lawyerAttorneyNumber;
    }

    public void setLawyerCardNumber(Long lawyerCardNumber) {
        this.lawyerCardNumber = lawyerCardNumber;
    }

    public Long getLawyerCardNumber() {
        return lawyerCardNumber;
    }

    public void setLawyerName(String lawyerName) {
        this.lawyerName = lawyerName;
    }

    public String getLawyerName() {
        return lawyerName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNationalNumber(Long nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public Long getNationalNumber() {
        return nationalNumber;
    }

    public void setNationality(Long nationality) {
        this.nationality = nationality;
    }

    public Long getNationality() {
        return nationality;
    }

    public void setNationalityLkpId(Long nationalityLkpId) {
        this.nationalityLkpId = nationalityLkpId;
    }

    public Long getNationalityLkpId() {
        return nationalityLkpId;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

//    public void setRequestId(Long requestId) {
//        this.requestId = requestId;
//    }
//
//    public Long getRequestId() {
//        return requestId;
//    }

    public void setSexLkpId(Long sexLkpId) {
        this.sexLkpId = sexLkpId;
    }

    public Long getSexLkpId() {
        return sexLkpId;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }
}
