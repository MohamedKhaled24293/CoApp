package com.techoffice.Services.dto;

import com.techoffice.Services.entity.HumGenericLookupValues;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;

public class HumGenericLookupDTO {
    private Long id;
    private String lookupDescription;
    private String lookupName;
    private List<HumGenericLookupValuesDTO> humGenericLookupValuesList;
    public HumGenericLookupDTO()
    {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setLookupDescription(String lookupDescription) {
        this.lookupDescription = lookupDescription;
    }

    public String getLookupDescription() {
        return lookupDescription;
    }

    public void setLookupName(String lookupName) {
        this.lookupName = lookupName;
    }

    public String getLookupName() {
        return lookupName;
    }

    public void setHumGenericLookupValuesList(List<HumGenericLookupValuesDTO> humGenericLookupValuesList) {
        this.humGenericLookupValuesList = humGenericLookupValuesList;
    }

    public List<HumGenericLookupValuesDTO> getHumGenericLookupValuesList() {
        return humGenericLookupValuesList;
    }
}
