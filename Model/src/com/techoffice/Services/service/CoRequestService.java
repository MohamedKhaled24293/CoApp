package com.techoffice.Services.service;

import com.techoffice.Services.dto.CoRequestDTO;

import java.util.List;

public interface CoRequestService {
    List<CoRequestDTO> findPetitonId(String petNumber);
    public CoRequestDTO add(CoRequestDTO reqDto);
    List<CoRequestDTO> findAllRequests();


}
