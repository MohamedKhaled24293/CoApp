package com.techoffice.Services.service;

import java.util.Map;

public interface GeneralService {
    Map<String,Long> getType();
    public Map<String, Long> fetchCountry();
    Map<String, Long> fetchCity();
    Map<String, Long> attachtTypes();


}
