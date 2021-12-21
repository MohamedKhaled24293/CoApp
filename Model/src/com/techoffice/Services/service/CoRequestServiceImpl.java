package com.techoffice.Services.service;

import com.techoffice.Services.dao.CoRequestDAO;
import com.techoffice.Services.dao.CoRequestDAOImpl;
import com.techoffice.Services.dto.CoRequestDTO;

import java.util.Collections;
import java.util.List;

public class CoRequestServiceImpl implements CoRequestService {
    CoRequestDAO dao = new CoRequestDAOImpl();
    @Override
    public List<CoRequestDTO> findPetitonId(String petNumber) {
        return dao.findPetitonId(petNumber);
    }

    @Override
    public CoRequestDTO add(CoRequestDTO reqDto) {
        
        return dao.add(reqDto);
    }

    @Override
    public List<CoRequestDTO> findAllRequests() {
        return dao.findAllRequests();
    }
}
