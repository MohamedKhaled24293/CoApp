package com.techoffice.view.beans;

//import com.techoffice.Services.client.CoApplicantClient;
//import com.techoffice.Services.client.CoApplicantClientImpl;
import com.techoffice.Services.client.CoRequestClient;
import com.techoffice.Services.client.CoRequestClientImpl;
import com.techoffice.Services.client.CoRequestPartyClient;
import com.techoffice.Services.client.CoRequestPartyClientImpl;
import com.techoffice.Services.client.GeneralClient;
import com.techoffice.Services.client.GeneralClientImpl;
import com.techoffice.Services.client.HumGenericLookupValuesClient;
import com.techoffice.Services.client.HumGenericLookupValuesClientImpl;
import com.techoffice.Services.dto.CoApplicantsDTO;
import com.techoffice.Services.dto.CoRequestDTO;

import com.techoffice.Services.dto.CoRequestPartyDTO;
import com.techoffice.Services.dto.CriminalJusticeFilesDetailsDTO;
import com.techoffice.Services.dto.LkpCountriesDTO;
import com.techoffice.Services.dto.generic.UserData;


import com.techoffice.view.JSFUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "requestbean")
@ViewScoped
public class requestBean {

    CoRequestDTO reqDto = new CoRequestDTO();
    CoApplicantsDTO coAppDto = new CoApplicantsDTO();
    CriminalJusticeFilesDetailsDTO justicFilesDto = new CriminalJusticeFilesDetailsDTO();


    GeneralClient genClient = new GeneralClientImpl();
    CoRequestClient coReqClient = new CoRequestClientImpl();
    CoRequestPartyClient coRecPartyClient = new CoRequestPartyClientImpl();


    HumGenericLookupValuesClient humLookupClient = new HumGenericLookupValuesClientImpl();
    private Map<String, Long> requestTypes = new HashMap<>();
    private Map<String, Long> incomingEntites = new HashMap<>();
    private Map<String, Long> receivingTypes = new HashMap<>();
    private Map<String, Long> applicantTypes = new HashMap<>();
    private Map<String, Long> nationalities = new HashMap<>(); //cities
    private Map<String, Long> genders = new HashMap<>();
    private Map<String, Long> cities = new HashMap<>();
    private Map<String, Long> attatchmentTypes = new HashMap<>();


    private String result = "";
    private boolean disableData;

    @PostConstruct
    public void init() {
        requestTypes = genClient.getType();
        incomingEntites = humLookupClient.incommingEntity();
        receivingTypes = humLookupClient.receivingTypes();
        userData.setEntityName("entityName");
        countries = genClient.fetchCountry();
        setDisableData(false);
        CoRequestPartyDTO reqPartyDto = new CoRequestPartyDTO();
        CoApplicantsDTO applicantDto = new CoApplicantsDTO();
        LkpCountriesDTO country=new LkpCountriesDTO();
        reqPartyDto.setCoRequest(reqDto);
        applicantDto.setCoRequest(reqDto);
        reqDto.setCountry(country);
        reqDto.getCoPartyList().add(reqPartyDto);
        reqDto.getCoApplicanstList().add(applicantDto);
        applicantTypes = humLookupClient.applicantTypes();
        nationalities = humLookupClient.applicantNationality();
        genders = humLookupClient.applicantGender();
        cities = genClient.fetchCity();
        attatchmentTypes = genClient.attachtTypes();
    }

    public String searchPet() {

        if (coReqClient.findPetitonId(reqDto.getPetitionNumber()).size() == 0) {
            setResult("The petition not found ");

        } else {
            setResult("The petition exist ");

        }
        setDisableData(true);

        return null;

    }

    public void setCoAppDto(CoApplicantsDTO coAppDto) {
        this.coAppDto = coAppDto;
    }

    public CoApplicantsDTO getCoAppDto() {
        return coAppDto;
    }

    public void setApplicantTypes(Map<String, Long> applicantTypes) {
        this.applicantTypes = applicantTypes;
    }

    public Map<String, Long> getApplicantTypes() {
        return applicantTypes;
    }

    public void setReceivingTypes(Map<String, Long> receivingTypes) {
        this.receivingTypes = receivingTypes;
    }

    public Map<String, Long> getReceivingTypes() {
        return receivingTypes;
    }
    private Map<String, Long> countries = new HashMap<>();
    UserData userData = new UserData();

    public void setHumLookupClient(HumGenericLookupValuesClient humLookupClient) {
        this.humLookupClient = humLookupClient;
    }

    public HumGenericLookupValuesClient getHumLookupClient() {
        return humLookupClient;
    }

    public void setIncomingEntites(Map<String, Long> incomingEntites) {
        this.incomingEntites = incomingEntites;
    }

    public Map<String, Long> getIncomingEntites() {
        return incomingEntites;
    }

    public void setRequestTypes(Map<String, Long> requestTypes) {
        this.requestTypes = requestTypes;
    }

    public Map<String, Long> getRequestTypes() {
        return requestTypes;
    }

    public void setReqDto(CoRequestDTO reqDto) {
        this.reqDto = reqDto;
    }

    public CoRequestDTO getReqDto() {
        return reqDto;
    }


    public void setNationalities(Map<String, Long> nationalities) {
        this.nationalities = nationalities;
    }

    public Map<String, Long> getNationalities() {
        return nationalities;
    }
    

    public String save() {
//        if(reqDto.getCoApplicanstList().get(0).getEmail() == null) {
//        JSFUtils.addFacesErrorMessage("Enter mail please");
//        return null;
//        }
        
        reqDto = coReqClient.add(reqDto);
        //        reqPartyDto.setCoRequest(reqDto);
        //        coRecPartyClient.add(reqPartyDto);
        return null;
    }

    public void setCities(Map<String, Long> cities) {
        this.cities = cities;
    }

    public Map<String, Long> getCities() {
        return cities;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setGeClient(GeneralClient genClient) {
        this.genClient = genClient;
    }

    public GeneralClient getGeClient() {
        return genClient;
    }


    public void setCountries(Map<String, Long> countries) {
        this.countries = countries;
    }

    public Map<String, Long> getCountries() {
        return countries;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setDisableData(boolean disableData) {
        this.disableData = disableData;
    }

    public boolean isDisableData() {
        return disableData;
    }

    public void setGenders(Map<String, Long> genders) {
        this.genders = genders;
    }

    public Map<String, Long> getGenders() {
        return genders;
    }


    public void setJusticFilesDto(CriminalJusticeFilesDetailsDTO justicFilesDto) {
        this.justicFilesDto = justicFilesDto;
    }

    public CriminalJusticeFilesDetailsDTO getJusticFilesDto() {
        return justicFilesDto;
    }

    public void setAttatchmentTypes(Map<String, Long> attatchmentTypes) {
        this.attatchmentTypes = attatchmentTypes;
    }

    public Map<String, Long> getAttatchmentTypes() {
        return attatchmentTypes;
    }
}
