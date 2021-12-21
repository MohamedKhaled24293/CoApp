package com.techoffice.Services.entity;

import java.io.Serializable;

import java.math.BigDecimal;

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
 * To create ID generator sequence "ENTITY_ID_SEQ_GEN":
 * CREATE SEQUENCE "ENTITY_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({ @NamedQuery(name = "EntityEntity.findAll", query = "select o from EntityEntity o") })
@Table(name = "ENTITY")
@SequenceGenerator(name = "EntityEntity_Id_Seq_Gen", sequenceName = "ENTITY_SEQ", allocationSize = 50,
                   initialValue = 50)
public class EntityEntity implements Serializable {
    private static final long serialVersionUID = 2576212475819609614L;
    @Column(length = 500)
    private String address;
    @Column(name = "CITY_ID")
    private BigDecimal cityId;
    private BigDecimal computerized;
    @Column(name = "COURT_ID")
    private BigDecimal courtId;
    @Column(name = "CREATED_BY", length = 20)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "DISTRICT_ID")
    private BigDecimal districtId;
    @Column(name = "ENTITY_CODE_1", length = 20)
    private String entityCode1;
    @Column(name = "ENTITY_CODE_2", length = 20)
    private String entityCode2;
    @Column(name = "ENTITY_CODE_3", length = 20)
    private String entityCode3;
    @Column(name = "ENTITY_DEGREE", length = 50)
    private String entityDegree;
    @Column(name = "ENTITY_DESC_1", length = 20)
    private String entityDesc1;
    @Column(name = "ENTITY_DESC_2", length = 20)
    private String entityDesc2;
    @Column(name = "ENTITY_DESC_3", length = 20)
    private String entityDesc3;
    @Column(name = "ENTITY_NAME", length = 200)
    private String entityName;
    @Column(name = "ENTITY_PRESIDENT")
    private BigDecimal entityPresident;
    @Column(name = "ENTITY_TYPE_ID")
    private BigDecimal entityTypeId;
    @Column(name = "FAX_NUMBER", length = 20)
    private String faxNumber;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EntityEntity_Id_Seq_Gen")
    private BigDecimal id;
    @Column(name = "IS_ACTIVE", length = 1)
    private String isActive;
    @Column(name = "IS_MOI_GS_INTEGRATIN_ACTIVE", length = 1)
    private String isMoiGsIntegratinActive;
    @Column(name = "IS_PETITION", length = 1)
    private String isPetition;
    @Column(name = "IS_UPDATED", length = 1)
    private String isUpdated;
    @Column(name = "MOI_GS_INTEGRATION_TYPE")
    private BigDecimal moiGsIntegrationType;
    @Column(name = "PARENT_ENTITY_ID")
    private BigDecimal parentEntityId;
    @Column(name = "POSTAL_CODE", length = 20)
    private String postalCode;
    @Column(name = "RECEIVED_FROM_COURT", length = 1)
    private String receivedFromCourt;
    @Column(name = "SENT_TO_COURT", length = 20)
    private String sentToCourt;
    @Column(name = "TELEPHONE_NUMBER", length = 20)
    private String telephoneNumber;
    @Column(name = "UPDATED_BY", length = 20)
    private String updatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    public EntityEntity() {
        
        
    }

    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getCityId() {
        return cityId;
    }

    public void setCityId(BigDecimal cityId) {
        this.cityId = cityId;
    }

    public BigDecimal getComputerized() {
        return computerized;
    }

    public void setComputerized(BigDecimal computerized) {
        this.computerized = computerized;
    }

    public BigDecimal getCourtId() {
        return courtId;
    }

    public void setCourtId(BigDecimal courtId) {
        this.courtId = courtId;
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

    public BigDecimal getDistrictId() {
        return districtId;
    }

    public void setDistrictId(BigDecimal districtId) {
        this.districtId = districtId;
    }

    public String getEntityCode1() {
        return entityCode1;
    }

    public void setEntityCode1(String entityCode1) {
        this.entityCode1 = entityCode1;
    }

    public String getEntityCode2() {
        return entityCode2;
    }

    public void setEntityCode2(String entityCode2) {
        this.entityCode2 = entityCode2;
    }

    public String getEntityCode3() {
        return entityCode3;
    }

    public void setEntityCode3(String entityCode3) {
        this.entityCode3 = entityCode3;
    }

    public String getEntityDegree() {
        return entityDegree;
    }

    public void setEntityDegree(String entityDegree) {
        this.entityDegree = entityDegree;
    }

    public String getEntityDesc1() {
        return entityDesc1;
    }

    public void setEntityDesc1(String entityDesc1) {
        this.entityDesc1 = entityDesc1;
    }

    public String getEntityDesc2() {
        return entityDesc2;
    }

    public void setEntityDesc2(String entityDesc2) {
        this.entityDesc2 = entityDesc2;
    }

    public String getEntityDesc3() {
        return entityDesc3;
    }

    public void setEntityDesc3(String entityDesc3) {
        this.entityDesc3 = entityDesc3;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public BigDecimal getEntityPresident() {
        return entityPresident;
    }

    public void setEntityPresident(BigDecimal entityPresident) {
        this.entityPresident = entityPresident;
    }

    public BigDecimal getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(BigDecimal entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public BigDecimal getId() {
        return id;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getIsMoiGsIntegratinActive() {
        return isMoiGsIntegratinActive;
    }

    public void setIsMoiGsIntegratinActive(String isMoiGsIntegratinActive) {
        this.isMoiGsIntegratinActive = isMoiGsIntegratinActive;
    }

    public String getIsPetition() {
        return isPetition;
    }

    public void setIsPetition(String isPetition) {
        this.isPetition = isPetition;
    }

    public String getIsUpdated() {
        return isUpdated;
    }

    public void setIsUpdated(String isUpdated) {
        this.isUpdated = isUpdated;
    }

    public BigDecimal getMoiGsIntegrationType() {
        return moiGsIntegrationType;
    }

    public void setMoiGsIntegrationType(BigDecimal moiGsIntegrationType) {
        this.moiGsIntegrationType = moiGsIntegrationType;
    }

    public BigDecimal getParentEntityId() {
        return parentEntityId;
    }

    public void setParentEntityId(BigDecimal parentEntityId) {
        this.parentEntityId = parentEntityId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getReceivedFromCourt() {
        return receivedFromCourt;
    }

    public void setReceivedFromCourt(String receivedFromCourt) {
        this.receivedFromCourt = receivedFromCourt;
    }

    public String getSentToCourt() {
        return sentToCourt;
    }

    public void setSentToCourt(String sentToCourt) {
        this.sentToCourt = sentToCourt;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
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

    public void setId(BigDecimal id) {
        this.id = id;
    }
}
