package com.techoffice.Services.entity;

import java.io.Serializable;



import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.core.sessions.CoreLogin;

/**
 * To create ID generator sequence "CO_REQUEST_ID_SEQ_GEN":
 * CREATE SEQUENCE "CO_REQUEST_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({ @NamedQuery(name = "CoRequest.findAll", query = "select o from CoRequest o") })
@Table(name = "CO_REQUEST")
@SequenceGenerator(name = "CoRequest_Id_Seq_Gen", sequenceName = "CO_REQUEST_SEQ", allocationSize = 1,
                   initialValue = 1)
public class CoRequest implements Serializable {
    @Column(name = "ASSIGNED_FROM")
    private Long assignedFrom;
    @Column(name = "ASSIGNED_TO")
    private Long assignedTo;
    @Column(name = "COOP_ENTITY_HEAD_SIGN")
    private Long coopEntityHeadSign;
    @Column(name = "CORELATION_TYPE_ID")
    private Long corelationTypeId;
    @Column(name = "CO_FILES_ID")
    private Long coFilesId;
    @Column(name = "CO_REQ_UNDER_HEAD_APPROVE")
    private Long coReqUnderHeadApprove;
    @Column(name = "CREATED_BY", length = 100)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Temporal(TemporalType.DATE)
    private Date deadline;
    @Column(name = "ENTITY_ID")
    private Long entityId;
    @Column(name = "FILE_NUMBER")
    private Long fileNumber;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CoRequest_Id_Seq_Gen")
    private Long id;
    @Column(name = "INCOMING_ENTITY_ID")
    private Long incomingEntityId;
    @Column(name = "INITIATOR_ID")
    private Long initiatorId;
    @Column(name = "INTERNAT_AGREEMENT_NAME", length = 200)
    private String internatAgreementName;
    @Column(name = "IS_AVAILABLE")
    private Integer isAvailable;
    @Column(name = "IS_FINANCIAL_COMMITMENTS_PAID")
    private Integer isFinancialCommitmentsPaid;
    @Column(length = 250)
    private String notes;
    @Column(name = "PETITION_ID")
    private Long petitionId;
    @Column(name = "PETITION_NUMBER", length = 150)
    private String petitionNumber;
    @Column(name = "RECEIVING_TYPE_ID")
    private Long receivingTypeId;
    @Column(name = "REQUEST_NUMBER", length = 100)
    private String requestNumber;
    @Column(name = "REQUEST_STATUS_ID")
    private Long requestStatusId;
//    @Column(name = "REQUEST_TYPE_ID")
//    private Long requestTypeId;
    @Column(name = "SOURCE_ENTITY")
    private Long sourceEntity;
    private String subject;
//    @Column(name = "SUBMIITING_ENTITY_ID")
//    private Long submiitingEntityId;
    @Temporal(TemporalType.DATE)
    @Column(name = "SUBMISSION_DATE")
    private Date submissionDate;
//    @Column(name = "SUBMITTED_COUNTRY_ID")
//    private Long submittedCountryId;
    @Column(name = "UPDATED_BY", length = 100)
    private String updatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;//   
    @ManyToOne( fetch = FetchType.LAZY,targetEntity=EntityEntity.class)
    @JoinColumn(name = "SUBMIITING_ENTITY_ID", nullable = false, referencedColumnName = "ID")
    private EntityEntity submiitingEntity;
    
    @ManyToOne( fetch = FetchType.LAZY,targetEntity=CoFiles.class)
    @JoinColumn(name = "REQUEST_TYPE_ID", nullable = false, referencedColumnName = "ID")
    private CoFiles coFileType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "coRequest",cascade={CascadeType.MERGE,CascadeType.PERSIST})
       private List<CoRequestParty> coPartyList; 
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "coRequest",cascade={CascadeType.MERGE,CascadeType.PERSIST})
       private List<CoApplicants> coApplicanstList;
    

    @ManyToOne(targetEntity = LkpCountries.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "SUBMITTED_COUNTRY_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    private LkpCountries country;

    public void setId(Long id) {
        this.id = id;
    }

//    public void setCoFile(CoFiles coFile) {
//        this.coFile = coFile;
//    }
//
//    public CoFiles getCoFile() {
//        return coFile;
//    }

    public CoRequest() {
        coPartyList=new ArrayList<>();
        coApplicanstList=new ArrayList<>();
        country=new LkpCountries();
        coFileType=new CoFiles();
        submiitingEntity=new EntityEntity();
    }


    public Long getAssignedFrom() {
        return assignedFrom;
    }

    public void setAssignedFrom(Long assignedFrom) {
        this.assignedFrom = assignedFrom;
    }

    public Long getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Long assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Long getCoopEntityHeadSign() {
        return coopEntityHeadSign;
    }

    public void setCoopEntityHeadSign(Long coopEntityHeadSign) {
        this.coopEntityHeadSign = coopEntityHeadSign;
    }

    public Long getCorelationTypeId() {
        return corelationTypeId;
    }

    public void setCorelationTypeId(Long corelationTypeId) {
        this.corelationTypeId = corelationTypeId;
    }

    public Long getCoFilesId() {
        return coFilesId;
    }

    public void setCoFilesId(Long coFilesId) {
        this.coFilesId = coFilesId;
    }

    public Long getCoReqUnderHeadApprove() {
        return coReqUnderHeadApprove;
    }

    public void setCoReqUnderHeadApprove(Long coReqUnderHeadApprove) {
        this.coReqUnderHeadApprove = coReqUnderHeadApprove;
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

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Long getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(Long fileNumber) {
        this.fileNumber = fileNumber;
    }

    public Long getId() {
        return id;
    }

    public Long getIncomingEntityId() {
        return incomingEntityId;
    }

    public void setIncomingEntityId(Long incomingEntityId) {
        this.incomingEntityId = incomingEntityId;
    }

    public Long getInitiatorId() {
        return initiatorId;
    }

    public void setInitiatorId(Long initiatorId) {
        this.initiatorId = initiatorId;
    }

    public String getInternatAgreementName() {
        return internatAgreementName;
    }

    public void setInternatAgreementName(String internatAgreementName) {
        this.internatAgreementName = internatAgreementName;
    }

    public Integer getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Integer isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Integer getIsFinancialCommitmentsPaid() {
        return isFinancialCommitmentsPaid;
    }

    public void setIsFinancialCommitmentsPaid(Integer isFinancialCommitmentsPaid) {
        this.isFinancialCommitmentsPaid = isFinancialCommitmentsPaid;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getPetitionId() {
        return petitionId;
    }

    public void setPetitionId(Long petitionId) {
        this.petitionId = petitionId;
    }

    public String getPetitionNumber() {
        return petitionNumber;
    }

    public void setPetitionNumber(String petitionNumber) {
        this.petitionNumber = petitionNumber;
    }

    public Long getReceivingTypeId() {
        return receivingTypeId;
    }

    public void setReceivingTypeId(Long receivingTypeId) {
        this.receivingTypeId = receivingTypeId;
    }

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public Long getRequestStatusId() {
        return requestStatusId;
    }

    public void setRequestStatusId(Long requestStatusId) {
        this.requestStatusId = requestStatusId;
    }

//    public Long getRequestTypeId() {
//        return requestTypeId;
//    }
//
//    public void setRequestTypeId(Long requestTypeId) {
//        this.requestTypeId = requestTypeId;
//    }

    public Long getSourceEntity() {
        return sourceEntity;
    }

    public void setSourceEntity(Long sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

//    public Long getSubmiitingEntityId() {
//        return submiitingEntityId;
//    }
//
//    public void setSubmiitingEntityId(Long submiitingEntityId) {
//        this.submiitingEntityId = submiitingEntityId;
//    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

//    public Long getSubmittedCountryId() {
//        return submittedCountryId;
//    }
//
//    public void setSubmittedCountryId(Long submittedCountryId) {
//        this.submittedCountryId = submittedCountryId;
//    }

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

    public void setCoPartyList(List<CoRequestParty> coPartyList) {
        this.coPartyList = coPartyList;
    }

    public List<CoRequestParty> getCoPartyList() {
        return coPartyList;
    }

    public void setCoApplicanstList(List<CoApplicants> coApplicanstList) {
        this.coApplicanstList = coApplicanstList;
    }

    public List<CoApplicants> getCoApplicanstList() {
        return coApplicanstList;
    }




    public void setCountry(LkpCountries country) {
        this.country = country;
    }

    public LkpCountries getCountry() {
        return country;
    }

    public void setCoFileType(CoFiles coFileType) {
        this.coFileType = coFileType;
    }

    public CoFiles getCoFileType() {
        return coFileType;
    }

    public void setSubmiitingEntity(EntityEntity submiitingEntity) {
        this.submiitingEntity = submiitingEntity;
    }

    public EntityEntity getSubmiitingEntity() {
        return submiitingEntity;
    }
}
