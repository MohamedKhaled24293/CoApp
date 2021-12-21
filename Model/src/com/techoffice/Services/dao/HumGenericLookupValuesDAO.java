package com.techoffice.Services.dao;

import java.util.Map;

public interface HumGenericLookupValuesDAO {
    Map<String,Long> incommingEntity();
    Map<String, Long> receivingTypes();
    Map<String, Long> applicantTypes();
    Map<String, Long> applicantNationality();
    Map<String, Long> applicantGender();
}
