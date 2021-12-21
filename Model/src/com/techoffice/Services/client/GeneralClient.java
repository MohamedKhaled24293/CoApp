package com.techoffice.Services.client;

import java.util.Map;

public interface GeneralClient {
    Map<String, Long> getType();
    Map<String, Long> fetchCountry();
    Map<String, Long> fetchCity();
    Map<String, Long> attachtTypes();

}
