package com.techoffice.Services.dto;


import com.techoffice.Services.entity.CoApplicants;
import com.techoffice.Services.entity.CoFiles;

import com.techoffice.Services.entity.CoRequestParty;

import com.techoffice.Services.entity.EntityEntity;

import com.techoffice.Services.entity.LkpCountries;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CoRequestDTO {
    private Long assignedFrom;
    private Long assignedTo;
    private Long coopEntityHeadSign;
    private Long corelationTypeId;
    private Long coFilesId;
    private Long coReqUnderHeadApprove;
    private String createdBy;
    private Date createdDate;
    private Date deadline;
    private Long entityId;
    private Long fileNumber;
    private Long id;
    private Long incomingEntityId;
    private Long initiatorId;
    private String internatAgreementName;
    private Integer isAvailable;
    private Integer isFinancialCommitmentsPaid;
    private String notes;
    private Long petitionId;
    private String petitionNumber;
    private Long receivingTypeId;
    private String requestNumber;
    private Long requestStatusId;
//    private Long requestTypeId;
    private Long sourceEntity;
    private String subject;
    private Long submiitingEntityId;
    private Date submissionDate;
//    private Long submittedCountryId;
    private String updatedBy;
    private Date updatedDate;
    private List<CoRequestPartyDTO> coPartyList;
    private List<CoApplicantsDTO> coApplicanstList;
    private LkpCountriesDTO country;
    private CoFilesDTO coFileType;
    private EntityDTO submiitingEntity;


    public CoRequestDTO(){
            coPartyList=new ArrayList<>();
            coApplicanstList=new ArrayList<>();
            coFileType=new CoFilesDTO();
            submiitingEntity=new EntityDTO();
            country=new LkpCountriesDTO();        
        }
    
    public void setCoApplicanstList(List<CoApplicantsDTO> coApplicanstList) {
        this.coApplicanstList = coApplicanstList;
    }

    public List<CoApplicantsDTO> getCoApplicanstList() {
        return coApplicanstList;
    }

    public void setAssignedFrom(Long assignedFrom) {
        this.assignedFrom = assignedFrom;
    }

    public Long getAssignedFrom() {
        return assignedFrom;
    }

    public void setAssignedTo(Long assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Long getAssignedTo() {
        return assignedTo;
    }

    public void setCoopEntityHeadSign(Long coopEntityHeadSign) {
        this.coopEntityHeadSign = coopEntityHeadSign;
    }

    public Long getCoopEntityHeadSign() {
        return coopEntityHeadSign;
    }

    public void setCorelationTypeId(Long corelationTypeId) {
        this.corelationTypeId = corelationTypeId;
    }

    public Long getCorelationTypeId() {
        return corelationTypeId;
    }

    public void setCoFilesId(Long coFilesId) {
        this.coFilesId = coFilesId;
    }

    public Long getCoFilesId() {
        return coFilesId;
    }

    public void setCoReqUnderHeadApprove(Long coReqUnderHeadApprove) {
        this.coReqUnderHeadApprove = coReqUnderHeadApprove;
    }

    public Long getCoReqUnderHeadApprove() {
        return coReqUnderHeadApprove;
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

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setFileNumber(Long fileNumber) {
        this.fileNumber = fileNumber;
    }

    public Long getFileNumber() {
        return fileNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setIncomingEntityId(Long incomingEntityId) {
        this.incomingEntityId = incomingEntityId;
    }

    public Long getIncomingEntityId() {
        return incomingEntityId;
    }

    public void setInitiatorId(Long initiatorId) {
        this.initiatorId = initiatorId;
    }

    public Long getInitiatorId() {
        return initiatorId;
    }

    public void setInternatAgreementName(String internatAgreementName) {
        this.internatAgreementName = internatAgreementName;
    }

    public String getInternatAgreementName() {
        return internatAgreementName;
    }

    public void setIsAvailable(Integer isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Integer getIsAvailable() {
        return isAvailable;
    }

    public void setIsFinancialCommitmentsPaid(Integer isFinancialCommitmentsPaid) {
        this.isFinancialCommitmentsPaid = isFinancialCommitmentsPaid;
    }

    public Integer getIsFinancialCommitmentsPaid() {
        return isFinancialCommitmentsPaid;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public void setPetitionId(Long petitionId) {
        this.petitionId = petitionId;
    }

    public Long getPetitionId() {
        return petitionId;
    }

    public void setPetitionNumber(String petitionNumber) {
        this.petitionNumber = petitionNumber;
    }

    public String getPetitionNumber() {
        return petitionNumber;
    }

    public void setReceivingTypeId(Long receivingTypeId) {
        this.receivingTypeId = receivingTypeId;
    }

    public Long getReceivingTypeId() {
        return receivingTypeId;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestStatusId(Long requestStatusId) {
        this.requestStatusId = requestStatusId;
    }

    public Long getRequestStatusId() {
        return requestStatusId;
    }

//    public void setRequestTypeId(Long requestTypeId) {
//        this.requestTypeId = requestTypeId;
//    }
//
//    public Long getRequestTypeId() {
//        return requestTypeId;
//    }

    public void setSourceEntity(Long sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    public Long getSourceEntity() {
        return sourceEntity;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubmiitingEntityId(Long submiitingEntityId) {
        this.submiitingEntityId = submiitingEntityId;
    }

    public Long getSubmiitingEntityId() {
        return submiitingEntityId;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

//    public void setSubmittedCountryId(Long submittedCountryId) {
//        this.submittedCountryId = submittedCountryId;
//    }
//
//    public Long getSubmittedCountryId() {
//        return submittedCountryId;
//    }

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

    public void setCoPartyList(List<CoRequestPartyDTO> coPartyList) {
        this.coPartyList = coPartyList;
    }

    public List<CoRequestPartyDTO> getCoPartyList() {
        return coPartyList;
    }



    public void setCountry(LkpCountriesDTO country) {
        this.country = country;
    }

    public LkpCountriesDTO getCountry() {
        return country;
    }


    public void setCoFileType(CoFilesDTO coFileType) {
        this.coFileType = coFileType;
    }

    public CoFilesDTO getCoFileType() {
        return coFileType;
    }

    public void setSubmiitingEntity(EntityDTO submiitingEntity) {
        this.submiitingEntity = submiitingEntity;
    }

    public EntityDTO getSubmiitingEntity() {
        return submiitingEntity;
    }
}
