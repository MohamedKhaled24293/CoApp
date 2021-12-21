package com.techoffice.Services.service;

import com.techoffice.Services.dao.HumGenericLookupValuesDAO;

import com.techoffice.Services.dao.HumGenericLookupValuesDAOImpl;

import java.util.Collections;
import java.util.Map;

public class HumGenericLookupValuesServiceImpl implements HumGenericLookupValuesService{
    HumGenericLookupValuesDAO dao= new HumGenericLookupValuesDAOImpl();
    @Override
    public Map<String, Long> incommingEntity() {
        return dao.incommingEntity();
    }

    @Override
    public Map<String, Long> receivingTypes() {
        
        return dao.receivingTypes();
    }
    @Override
    public Map<String, Long> applicantTypes() {
        return dao.applicantTypes();
    }

    @Override
    public Map<String, Long> applicantNationality() {
         return dao.applicantNationality();
    }

    @Override
    public Map<String, Long> applicantGender() {
        
        return dao.applicantGender();
    }
}
