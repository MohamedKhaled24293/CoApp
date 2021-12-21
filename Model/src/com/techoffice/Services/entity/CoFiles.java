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
 * To create ID generator sequence "CO_FILES_ID_SEQ_GEN":
 * CREATE SEQUENCE "CO_FILES_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({ @NamedQuery(name = "CoFiles.findAll", query = "select o from CoFiles o") })
@Table(name = "CO_FILES")
@SequenceGenerator(name = "CoFiles_Id_Seq_Gen", sequenceName = "CO_FILES_SEQ", allocationSize = 50,
                   initialValue = 50)
public class CoFiles implements Serializable {
    @Column(name = "CREATED_BY", length = 100)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "CURRENT_FILE_NUMBER")
    private Long currentFileNumber;
    @Column(name = "DISTRIBUTION_METHOD_LKP")
    private Long distributionMethodLkp;
    @Column(name = "ENTITY_ID")
    private Long entityId;
    @Column(name = "FILE_CLASSIFICATION_ID")
    private Long fileClassificationId;
    @Column(name = "FILE_TYPE", length = 200)
    private String fileType;
    @Column(name = "FUTURE_FILE_NUMBER")
    private Long futureFileNumber;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CoFiles_Id_Seq_Gen")
    private Long id;
    @Column(name = "IS_SHOWING_FOREIGN_COUNTRIES")
    private Integer isShowingForeignCountries;
    @Column(name = "IS_SUBMITTED_BY_PROSECUTIONS")
    private Integer isSubmittedByProsecutions;
    @Column(name = "IS_UPDATED")
    private Integer isUpdated;
    @Column(name = "UPDATED_BY", length = 100)
    private String updatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;
    @Column(name = "USER_ID")
    private Long userId;

    public CoFiles() {
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

    public Long getCurrentFileNumber() {
        return currentFileNumber;
    }

    public void setCurrentFileNumber(Long currentFileNumber) {
        this.currentFileNumber = currentFileNumber;
    }

    public Long getDistributionMethodLkp() {
        return distributionMethodLkp;
    }

    public void setDistributionMethodLkp(Long distributionMethodLkp) {
        this.distributionMethodLkp = distributionMethodLkp;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Long getFileClassificationId() {
        return fileClassificationId;
    }

    public void setFileClassificationId(Long fileClassificationId) {
        this.fileClassificationId = fileClassificationId;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Long getFutureFileNumber() {
        return futureFileNumber;
    }

    public void setFutureFileNumber(Long futureFileNumber) {
        this.futureFileNumber = futureFileNumber;
    }

    public Long getId() {
        return id;
    }

    public Integer getIsShowingForeignCountries() {
        return isShowingForeignCountries;
    }

    public void setIsShowingForeignCountries(Integer isShowingForeignCountries) {
        this.isShowingForeignCountries = isShowingForeignCountries;
    }

    public Integer getIsSubmittedByProsecutions() {
        return isSubmittedByProsecutions;
    }

    public void setIsSubmittedByProsecutions(Integer isSubmittedByProsecutions) {
        this.isSubmittedByProsecutions = isSubmittedByProsecutions;
    }

    public Integer getIsUpdated() {
        return isUpdated;
    }

    public void setIsUpdated(Integer isUpdated) {
        this.isUpdated = isUpdated;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
