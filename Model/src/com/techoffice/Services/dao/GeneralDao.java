package com.techoffice.Services.dao;

import java.util.HashMap;
import java.util.Map;

public interface GeneralDao {
    Map<String,Long> getType();
    Map<String,Long> fetchCountry();
    Map<String,Long> fetchCity();
    Map<String, Long> attachtTypes();
   // Long findPetitonId(Long petNumber);
    
}
