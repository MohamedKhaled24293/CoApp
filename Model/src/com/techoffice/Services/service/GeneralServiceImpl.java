package com.techoffice.Services.service;

import com.techoffice.Services.dao.GeneralDao;

import com.techoffice.Services.dao.GeneralDaoImpl;

import java.util.Collections;
import java.util.Map;

public class GeneralServiceImpl implements GeneralService {
    GeneralDao genDao=new GeneralDaoImpl();
    @Override
    public Map<String, Long> getType() {
        // TODO Implement this method
        return genDao.getType();
    }

    @Override
    public Map<String, Long> fetchCountry() {
        // TODO Implement this method
        return genDao.fetchCountry();
    }

    @Override
    public Map<String, Long> fetchCity() {
        
        return genDao.fetchCity();
    }

    @Override
    public Map<String, Long> attachtTypes() {
        
        return genDao.attachtTypes();
    }
}
