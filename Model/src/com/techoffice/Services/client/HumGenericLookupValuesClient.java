package com.techoffice.Services.client;

import java.util.Map;

public interface HumGenericLookupValuesClient {
    Map<String, Long> incommingEntity();
    Map<String, Long> receivingTypes();
    Map<String, Long> applicantTypes();
    Map<String, Long> applicantNationality();
    Map<String, Long> applicantGender();

    
}
