package com.techoffice.Services.client;

import com.techoffice.Services.dto.CoRequestDTO;

import java.util.List;

public interface CoRequestClient {
    List<CoRequestDTO> findPetitonId(String petNumber);
     CoRequestDTO add(CoRequestDTO reqDto);
    List<CoRequestDTO> findAllRequests();


}
