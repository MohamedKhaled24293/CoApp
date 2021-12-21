package com.techoffice.Services.dto;



public class HumGenericLookupValuesDTO {
    private Long id;
    private String valueCode;
    private String valueTitle;
    private HumGenericLookupDTO humGenericLookup;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setValueCode(String valueCode) {
        this.valueCode = valueCode;
    }

    public String getValueCode() {
        return valueCode;
    }

    public void setValueTitle(String valueTitle) {
        this.valueTitle = valueTitle;
    }

    public String getValueTitle() {
        return valueTitle;
    }

    public void setHumGenericLookup(HumGenericLookupDTO humGenericLookup) {
        this.humGenericLookup = humGenericLookup;
    }

    public HumGenericLookupDTO getHumGenericLookup() {
        return humGenericLookup;
    }

    public HumGenericLookupValuesDTO() {
    }
}
