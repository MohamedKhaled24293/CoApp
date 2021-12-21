package com.techoffice.Services.dao;

import com.techoffice.Services.dto.CoRequestDTO;

import java.util.List;

public interface CoRequestDAO {
    
    List<CoRequestDTO> findPetitonId(String petNumber);
    CoRequestDTO add(CoRequestDTO reqDto);
    List<CoRequestDTO> findAllRequests();
    

}
