package com.techoffice.Services.entity;

import java.io.Serializable;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * To create ID generator sequence "CO_PETITIONS_ID_SEQ_GEN":
 * CREATE SEQUENCE "CO_PETITIONS_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({ @NamedQuery(name = "CoPetitions.findAll", query = "select o from CoPetitions o") })
@Table(name = "CO_PETITIONS")
@SequenceGenerator(name = "CoPetitions_Id_Seq_Gen", sequenceName = "CO_PETITIONS_SEQ", allocationSize = 50,
                   initialValue = 50)
public class CoPetitions implements Serializable {
    private static final long serialVersionUID = 2928413671057597348L;
    @Temporal(TemporalType.DATE)
    @Column(name = "CRATED_DATE")
    private Date cratedDate;
    @Column(name = "CREATED_BY", length = 1)
    private String createdBy;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CoPetitions_Id_Seq_Gen")
    private Long id;
    @Column(name = "PETITION_NUMBER")
    private Long petitionNumber;
    @Column(name = "PETITION_YEAR")
    private Integer petitionYear;
//    @Column(name = "REQUEST_ID")
//    private Long requestId;
    @Column(name = "UPDATED_BY", length = 1)
    private String updatedBy;
    @Column(name = "UPDATED_DATE", length = 1)
    private String updatedDate;
    @ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "REQUEST_ID")
    private CoRequest coRequest;

    public CoPetitions() {
    }

   

    public Date getCratedDate() {
        return cratedDate;
    }

    public void setCratedDate(Date cratedDate) {
        this.cratedDate = cratedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getId() {
        return id;
    }

    public Long getPetitionNumber() {
        return petitionNumber;
    }

    public void setPetitionNumber(Long petitionNumber) {
        this.petitionNumber = petitionNumber;
    }

    public Integer getPetitionYear() {
        return petitionYear;
    }

    public void setPetitionYear(Integer petitionYear) {
        this.petitionYear = petitionYear;
    }


    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCoRequest(CoRequest coRequest) {
        this.coRequest = coRequest;
    }

    public CoRequest getCoRequest() {
        return coRequest;
    }
}
