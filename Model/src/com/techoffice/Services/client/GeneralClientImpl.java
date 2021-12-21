package com.techoffice.Services.client;



import com.techoffice.Services.service.GeneralService;

import com.techoffice.Services.service.GeneralServiceImpl;

import java.util.Collections;
import java.util.Map;

public class GeneralClientImpl implements GeneralClient{
    GeneralService genService=new GeneralServiceImpl();
    @Override
    public Map<String, Long> getType() {
        return genService.getType();
    }

    @Override
    public Map<String, Long> fetchCountry() {
        return genService.fetchCountry();
    }

    @Override
    public Map<String, Long> fetchCity() {
        
        return genService.fetchCity();
    }

    @Override
    public Map<String, Long> attachtTypes() {
        
        return genService.attachtTypes();
    }
}
