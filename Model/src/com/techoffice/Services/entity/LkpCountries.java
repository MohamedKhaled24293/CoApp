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
 * To create ID generator sequence "LKP_COUNTRIES_ID_SEQ_GEN":
 * CREATE SEQUENCE "LKP_COUNTRIES_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({ @NamedQuery(name = "LkpCountries.findAll", query = "select o from LkpCountries o") })
@Table(name = "LKP_COUNTRIES")
@SequenceGenerator(name = "LkpCountries_Id_Seq_Gen", sequenceName = "COUNTRY_ID_SEQ", allocationSize = 1,
                   initialValue = 1)
public class LkpCountries implements Serializable {
    private static final long serialVersionUID = 7740384665270561677L;
    @Column(name = "COUNTRY_CODE", length = 20)
    private String countryCode;
    @Column(name = "CREATED_BY", nullable = false, length = 20)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE", nullable = false)
    private Date createdDate;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LkpCountries_Id_Seq_Gen")
    private BigDecimal id;
    @Column(nullable = false, length = 150)
    private String name;
    @Column(name = "UPDATED_BY", length = 20)
    private String updatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    public LkpCountries() {
    }

   

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

    public BigDecimal getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
