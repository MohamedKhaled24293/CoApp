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
 * To create ID generator sequence "CO_CASE_NUMBERS_ID_SEQ_GEN":
 * CREATE SEQUENCE "CO_CASE_NUMBERS_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({ @NamedQuery(name = "CoCaseNumbers.findAll", query = "select o from CoCaseNumbers o") })
@Table(name = "CO_CASE_NUMBERS")
@SequenceGenerator(name = "CoCaseNumbers_Id_Seq_Gen", sequenceName = "CO_CASE_NUMBERS_ID_SEQ_GEN", allocationSize = 50,
                   initialValue = 50)
public class CoCaseNumbers implements Serializable {
    @Column(name = "CASE_CLASSIFICATION_ID")
    private Long caseClassificationId;
    @Column(name = "CASE_NUMBER")
    private Long caseNumber;
    @Column(name = "CASE_YEAR")
    private Integer caseYear;
    @Column(name = "CREATED_BY", length = 150)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "ENTITY_ID")
    private Long entityId;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CoCaseNumbers_Id_Seq_Gen")
    private Long id;
    @Column(name = "UPDATED_BY", length = 150)
    private String updatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    public CoCaseNumbers() {
    }

    public CoCaseNumbers(Long caseClassificationId, Long caseNumber, Integer caseYear, String createdBy,
                         Date createdDate, Long entityId, Long id, String updatedBy, Date updatedDate) {
        this.caseClassificationId = caseClassificationId;
        this.caseNumber = caseNumber;
        this.caseYear = caseYear;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.entityId = entityId;
        this.id = id;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
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

    public Integer getCaseYear() {
        return caseYear;
    }

    public void setCaseYear(Integer caseYear) {
        this.caseYear = caseYear;
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

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Long getId() {
        return id;
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
