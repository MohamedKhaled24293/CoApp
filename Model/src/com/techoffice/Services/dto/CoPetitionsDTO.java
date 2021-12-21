package com.techoffice.Services.dto;


import com.techoffice.Services.entity.CoRequest;

import java.util.Date;



public class CoPetitionsDTO {
    private Date cratedDate;
    private String createdBy;
    private Long id;
    private Long petitionNumber;
    private Integer petitionYear;
    private Long requestId;
    private String updatedBy;
    private String updatedDate;
    private CoRequest coRequest;

    public void setCoRequest(CoRequest coRequest) {
        this.coRequest = coRequest;
    }

    public CoRequest getCoRequest() {
        return coRequest;
    }


    public CoPetitionsDTO(){}
    public void setCratedDate(Date cratedDate) {
        this.cratedDate = cratedDate;
    }

    public Date getCratedDate() {
        return cratedDate;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPetitionNumber(Long petitionNumber) {
        this.petitionNumber = petitionNumber;
    }

    public Long getPetitionNumber() {
        return petitionNumber;
    }

    public void setPetitionYear(Integer petitionYear) {
        this.petitionYear = petitionYear;
    }

    public Integer getPetitionYear() {
        return petitionYear;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }
}
