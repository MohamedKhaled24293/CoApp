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
 * To create ID generator sequence "CRIMINAL_JUSTICE_FILES_DETAILS_ID_SEQ_GEN":
 * CREATE SEQUENCE "CRIMINAL_JUSTICE_FILES_DETAILS_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({
              @NamedQuery(name = "CriminalJusticeFilesDetails.findAll",
                          query = "select o from CriminalJusticeFilesDetails o") })
@Table(name = "CRIMINAL_JUSTICE_FILES_DETAILS")
@SequenceGenerator(name = "CriminalJusticeFilesDetails_Id_Seq_Gen",
                   sequenceName = "CRIMINAL_JUSTICE_FILES_DETAILS_ID_SEQ_GEN", allocationSize = 50, initialValue = 50)
public class CriminalJusticeFilesDetails implements Serializable {
    private static final long serialVersionUID = -3290519588310445547L;
    @Column(name = "BAN_FILE_TYPE_ID")
    private Long banFileTypeId;
    @Column(name = "BAN_FILE_TYPE_OTHER", length = 300)
    private String banFileTypeOther;
    private Long businesscasedetailedid;
    private Long businesscaseid;
    private Long caseschemaid;
    @Column(name = "CITIZEN_REQUEST_ID")
    private Long citizenRequestId;
    @Column(name = "CLAIM_PROC_ID")
    private Long claimProcId;
    @Column(name = "CREATED_BY", length = 200)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(length = 200)
    private String ddocname;
    @Column(name = "DETAILED_ID")
    private Long detailedId;
    @Column(length = 200)
    private String did;
    @Column(name = "DOWNLOAD_EXCEPTION", length = 500)
    private String downloadException;
    private Long entityid;
    @Column(length = 200)
    private String filename;
    @Column(length = 200)
    private String filepath;
    @Column(name = "HIDE_ATTACHMENT")
    private Long hideAttachment;
    @Column(name = "HUM_PRISON_ID")
    private Long humPrisonId;
    @Column(name = "HUM_WORKING_GROUP_ID")
    private Long humWorkingGroupId;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CriminalJusticeFilesDetails_Id_Seq_Gen")
    private Long id;
    @Column(name = "LKP_CATEGORIES_ID")
    private Long lkpCategoriesId;
    @Column(name = "MODEL_NAME", length = 300)
    private String modelName;
    private Long parid;
    @Column(name = "PARTY_DOC_TYPE", length = 200)
    private String partyDocType;
    @Column(name = "PARTY_ID")
    private Long partyId;
    private Long pirid;
    @Column(name = "PROC_ID")
    private Long procId;
    @Column(name = "RESERVAION_ID")
    private Long reservaionId;
    @Column(name = "ROW_ID")
    private Long rowId;
    private Long status;
    @Column(name = "TECH_DET_ID")
    private Long techDetId;
    @Column(name = "TECH_PET_ID")
    private Long techPetId;
    private Long templateobjectid;
    private Long typeid;
    @Column(name = "UPDATED_BY", length = 200)
    private String updatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;
    @Column(name = "UPLOAD_EXCEPTION", length = 500)
    private String uploadException;
    @Column(length = 500)
    private String url;
    private Long userid;

    public CriminalJusticeFilesDetails() {
    }

   
    public Long getBanFileTypeId() {
        return banFileTypeId;
    }

    public void setBanFileTypeId(Long banFileTypeId) {
        this.banFileTypeId = banFileTypeId;
    }

    public String getBanFileTypeOther() {
        return banFileTypeOther;
    }

    public void setBanFileTypeOther(String banFileTypeOther) {
        this.banFileTypeOther = banFileTypeOther;
    }

    public Long getBusinesscasedetailedid() {
        return businesscasedetailedid;
    }

    public void setBusinesscasedetailedid(Long businesscasedetailedid) {
        this.businesscasedetailedid = businesscasedetailedid;
    }

    public Long getBusinesscaseid() {
        return businesscaseid;
    }

    public void setBusinesscaseid(Long businesscaseid) {
        this.businesscaseid = businesscaseid;
    }

    public Long getCaseschemaid() {
        return caseschemaid;
    }

    public void setCaseschemaid(Long caseschemaid) {
        this.caseschemaid = caseschemaid;
    }

    public Long getCitizenRequestId() {
        return citizenRequestId;
    }

    public void setCitizenRequestId(Long citizenRequestId) {
        this.citizenRequestId = citizenRequestId;
    }

    public Long getClaimProcId() {
        return claimProcId;
    }

    public void setClaimProcId(Long claimProcId) {
        this.claimProcId = claimProcId;
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

    public String getDdocname() {
        return ddocname;
    }

    public void setDdocname(String ddocname) {
        this.ddocname = ddocname;
    }

    public Long getDetailedId() {
        return detailedId;
    }

    public void setDetailedId(Long detailedId) {
        this.detailedId = detailedId;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDownloadException() {
        return downloadException;
    }

    public void setDownloadException(String downloadException) {
        this.downloadException = downloadException;
    }

    public Long getEntityid() {
        return entityid;
    }

    public void setEntityid(Long entityid) {
        this.entityid = entityid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Long getHideAttachment() {
        return hideAttachment;
    }

    public void setHideAttachment(Long hideAttachment) {
        this.hideAttachment = hideAttachment;
    }

    public Long getHumPrisonId() {
        return humPrisonId;
    }

    public void setHumPrisonId(Long humPrisonId) {
        this.humPrisonId = humPrisonId;
    }

    public Long getHumWorkingGroupId() {
        return humWorkingGroupId;
    }

    public void setHumWorkingGroupId(Long humWorkingGroupId) {
        this.humWorkingGroupId = humWorkingGroupId;
    }

    public Long getId() {
        return id;
    }

    public Long getLkpCategoriesId() {
        return lkpCategoriesId;
    }

    public void setLkpCategoriesId(Long lkpCategoriesId) {
        this.lkpCategoriesId = lkpCategoriesId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Long getParid() {
        return parid;
    }

    public void setParid(Long parid) {
        this.parid = parid;
    }

    public String getPartyDocType() {
        return partyDocType;
    }

    public void setPartyDocType(String partyDocType) {
        this.partyDocType = partyDocType;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public Long getPirid() {
        return pirid;
    }

    public void setPirid(Long pirid) {
        this.pirid = pirid;
    }

    public Long getProcId() {
        return procId;
    }

    public void setProcId(Long procId) {
        this.procId = procId;
    }

    public Long getReservaionId() {
        return reservaionId;
    }

    public void setReservaionId(Long reservaionId) {
        this.reservaionId = reservaionId;
    }

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getTechDetId() {
        return techDetId;
    }

    public void setTechDetId(Long techDetId) {
        this.techDetId = techDetId;
    }

    public Long getTechPetId() {
        return techPetId;
    }

    public void setTechPetId(Long techPetId) {
        this.techPetId = techPetId;
    }

    public Long getTemplateobjectid() {
        return templateobjectid;
    }

    public void setTemplateobjectid(Long templateobjectid) {
        this.templateobjectid = templateobjectid;
    }

    public Long getTypeid() {
        return typeid;
    }

    public void setTypeid(Long typeid) {
        this.typeid = typeid;
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

    public String getUploadException() {
        return uploadException;
    }

    public void setUploadException(String uploadException) {
        this.uploadException = uploadException;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}
