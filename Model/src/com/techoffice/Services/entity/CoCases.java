package com.techoffice.Services.entity;

import java.io.Serializable;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * To create ID generator sequence "CO_CASES_ID_SEQ_GEN":
 * CREATE SEQUENCE "CO_CASES_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({ @NamedQuery(name = "CoCases.findAll", query = "select o from CoCases o") })
@Table(name = "CO_CASES")
@SequenceGenerator(name = "CoCases_Id_Seq_Gen", sequenceName = "CO_CASES_ID_SEQ_GEN", allocationSize = 50,
                   initialValue = 50)
public class CoCases implements Serializable {
    @Column(name = "BUSINESS_CASE_ID")
    private Long businessCaseId;
    @Column(name = "CASE_CLASSIFICATION_ID")
    private Long caseClassificationId;
    @Column(name = "CASE_NUMBER")
    private Long caseNumber;
    @Column(name = "CASE_TABLE_ID")
    private Long caseTableId;
    @Column(name = "CASE_YEAR")
    private Long caseYear;
    @Column(name = "CORELATION_TYPE_ID")
    private Long corelationTypeId;
    @Column(name = "CREATED_BY", length = 150)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "DEADLINE_DATE")
    private Date deadlineDate;
    @Column(name = "ENTITY_ID")
    private Long entityId;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CoCases_Id_Seq_Gen")
    private Long id;
    @Column(name = "IS_CORRELATED")
    private Integer isCorrelated;
    @Column(name = "REGISTRATION_AUTHORITY_ID")
    private Long registrationAuthorityId;
    @Column(name = "REQUEST_ID")
    private Long requestId;
    @Column(name = "UPDATED_BY", length = 150)
    private String updatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    public CoCases() {
    }

   
    public Long getBusinessCaseId() {
        return businessCaseId;
    }

    public void setBusinessCaseId(Long businessCaseId) {
        this.businessCaseId = businessCaseId;
    }

    public Long getCaseClassificationId() {
        return caseClassificationId;
    }

    public void setCaseClassificationId(Long caseClassificationId) {
        this.caseClassificationId = caseClassificationId;
    }

    public Long getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(Long caseNumber) {
        this.caseNumber = caseNumber;
    }

    public Long getCaseTableId() {
        return caseTableId;
    }

    public void setCaseTableId(Long caseTableId) {
        this.caseTableId = caseTableId;
    }

    public Long getCaseYear() {
        return caseYear;
    }

    public void setCaseYear(Long caseYear) {
        this.caseYear = caseYear;
    }

    public Long getCorelationTypeId() {
        return corelationTypeId;
    }

    public void setCorelationTypeId(Long corelationTypeId) {
        this.corelationTypeId = corelationTypeId;
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

    public Date getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(Date deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Long getId() {
        return id;
    }

    public Integer getIsCorrelated() {
        return isCorrelated;
    }

    public void setIsCorrelated(Integer isCorrelated) {
        this.isCorrelated = isCorrelated;
    }

    public Long getRegistrationAuthorityId() {
        return registrationAuthorityId;
    }

    public void setRegistrationAuthorityId(Long registrationAuthorityId) {
        this.registrationAuthorityId = registrationAuthorityId;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
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
}
