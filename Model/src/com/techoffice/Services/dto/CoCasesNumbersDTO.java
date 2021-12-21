package com.techoffice.Services.dto;

import com.techoffice.Services.entity.CoCaseNumbers;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class CoCasesNumbersDTO {
    private Long caseClassificationId;
    private Long caseNumber;
    private Integer caseYear;
    private String createdBy;
    private Date createdDate;
    private Long entityId;
    private Long id;
    private String updatedBy;
    private Date updatedDate;

    public CoCasesNumbersDTO() {
    }

    public void setCaseClassificationId(Long caseClassificationId) {
        this.caseClassificationId = caseClassificationId;
    }

    public Long getCaseClassificationId() {
        return caseClassificationId;
    }

    public void setCaseNumber(Long caseNumber) {
        this.caseNumber = caseNumber;
    }

    public Long getCaseNumber() {
        return caseNumber;
    }

    public void setCaseYear(Integer caseYear) {
        this.caseYear = caseYear;
    }

    public Integer getCaseYear() {
        return caseYear;
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

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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
}
