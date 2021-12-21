package com.techoffice.Services.service;

import java.util.Map;

public interface HumGenericLookupValuesService {
    Map<String, Long> incommingEntity();
    Map<String, Long> receivingTypes();
    Map<String, Long> applicantTypes();
    Map<String, Long> applicantNationality();
    Map<String, Long> applicantGender();
}
