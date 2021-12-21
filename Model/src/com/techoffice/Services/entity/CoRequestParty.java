package com.techoffice.Services.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "CoRequestParty.findAll", query = "select o from CoRequestParty o") })
@Table(name = "CO_REQUEST_PARTY")
public class CoRequestParty implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CO_REQUEST_PARTY_Seq_Gen")
    @SequenceGenerator(name = "CO_REQUEST_PARTY_Seq_Gen", sequenceName = "CO_REQUEST_PARTY_SEQ", allocationSize = 1, initialValue = 1)
    private Long id;
    
    @Column(length = 200)
    private String name;

//    @Column(name = "REQUESTED_FROM_COUNTRY_ID")
//    private Long requestedFromCountryId;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "REQUEST_ID")
    private CoRequest coRequest;
    
    @ManyToOne(targetEntity = LkpCountries.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "REQUESTED_FROM_COUNTRY_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    private LkpCountries country;
    
    @Column(name = "NATIONALITY_ID")
    private Long nationalityId;

    public CoRequestParty() {
    }

    public Long getId() {
            return id;
    }

    public void setId(Long id) {
            this.id = id;
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

//    public Long getRequestedFromCountryId() {
//            return requestedFromCountryId;
//    }
//
//    public void setRequestedFromCountryId(Long requestedFromCountryId) {
//            this.requestedFromCountryId = requestedFromCountryId;
//    }

    public CoRequest getCoRequest() {
            return coRequest;
    }

    public void setCoRequest(CoRequest coRequest) {
            this.coRequest = coRequest;
    }

    public Long getNationalityId() {
            return nationalityId;
    }

    public void setNationalityId(Long nationalityId) {
            this.nationalityId = nationalityId;
    }


    public void setCountry(LkpCountries country) {
        this.country = country;
    }

    public LkpCountries getCountry() {
        return country;
    }
}
