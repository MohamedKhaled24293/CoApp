package com.techoffice.Services.client;


import com.techoffice.Services.service.HumGenericLookupValuesService;

import com.techoffice.Services.service.HumGenericLookupValuesServiceImpl;

import java.util.Collections;
import java.util.Map;

public class HumGenericLookupValuesClientImpl implements HumGenericLookupValuesClient {
    HumGenericLookupValuesService service= new HumGenericLookupValuesServiceImpl();
    
    
    @Override
    public Map<String, Long> incommingEntity() {
        return service.incommingEntity();
    }
   public Map<String, Long> receivingTypes()
   {
        return service.receivingTypes();
       
    }
    public Map<String, Long> applicantTypes() {
        return service.applicantTypes();
    }

    @Override
    public Map<String, Long> applicantNationality() {
        
        return service.applicantNationality();
    }

    @Override
    public Map<String, Long> applicantGender() {
        
        return service.applicantGender();
    }
}
