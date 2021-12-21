package com.techoffice.Services.dto;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class CoFilesDTO {
    private String createdBy;
    private Date createdDate;
    private Long currentFileNumber;
    private Long distributionMethodLkp;
    private Long entityId;
    private Long fileClassificationId;
    private String fileType;
    private Long futureFileNumber;
    private Long id;
    private Integer isShowingForeignCountries;
    private Integer isSubmittedByProsecutions;
    private Integer isUpdated;
    private String updatedBy;
    private Date updatedDate;
    private Long userId;
    
    public CoFilesDTO(){}

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

    public void setCurrentFileNumber(Long currentFileNumber) {
        this.currentFileNumber = currentFileNumber;
    }

    public Long getCurrentFileNumber() {
        return currentFileNumber;
    }

    public void setDistributionMethodLkp(Long distributionMethodLkp) {
        this.distributionMethodLkp = distributionMethodLkp;
    }

    public Long getDistributionMethodLkp() {
        return distributionMethodLkp;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setFileClassificationId(Long fileClassificationId) {
        this.fileClassificationId = fileClassificationId;
    }

    public Long getFileClassificationId() {
        return fileClassificationId;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFutureFileNumber(Long futureFileNumber) {
        this.futureFileNumber = futureFileNumber;
    }

    public Long getFutureFileNumber() {
        return futureFileNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setIsShowingForeignCountries(Integer isShowingForeignCountries) {
        this.isShowingForeignCountries = isShowingForeignCountries;
    }

    public Integer getIsShowingForeignCountries() {
        return isShowingForeignCountries;
    }

    public void setIsSubmittedByProsecutions(Integer isSubmittedByProsecutions) {
        this.isSubmittedByProsecutions = isSubmittedByProsecutions;
    }

    public Integer getIsSubmittedByProsecutions() {
        return isSubmittedByProsecutions;
    }

    public void setIsUpdated(Integer isUpdated) {
        this.isUpdated = isUpdated;
    }

    public Integer getIsUpdated() {
        return isUpdated;
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

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}
