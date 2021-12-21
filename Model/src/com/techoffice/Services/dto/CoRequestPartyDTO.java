package com.techoffice.Services.dto;

import com.techoffice.Services.entity.CoRequest;
import com.techoffice.Services.entity.LkpCountries;

public class CoRequestPartyDTO {
    private Long id; 
    private String name;  
//    private Long requestedFromCountryId;   
    private CoRequestDTO coRequest; 
    private LkpCountriesDTO country;

    private Long nationalityId;  
    public CoRequestPartyDTO() { 
        country=new LkpCountriesDTO();
        }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setRequestedFromCountryId(Long requestedFromCountryId) {
//        this.requestedFromCountryId = requestedFromCountryId;
//    }
//
//    public Long getRequestedFromCountryId() {
//        return requestedFromCountryId;
//    }

    public void setCoRequest(CoRequestDTO coRequest) {
        this.coRequest = coRequest;
    }

    public CoRequestDTO getCoRequest() {
        return coRequest;
    }

    public void setNationalityId(Long nationalityId) {
        this.nationalityId = nationalityId;
    }

    public Long getNationalityId() {
        return nationalityId;
    }

    public void setCountry(LkpCountriesDTO country) {
        this.country = country;
    }

    public LkpCountriesDTO getCountry() {
        return country;
    }
}
