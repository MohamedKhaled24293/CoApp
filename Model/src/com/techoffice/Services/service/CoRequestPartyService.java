package com.techoffice.Services.service;

import com.techoffice.Services.dao.CoRequestPartyDAOImpl;
import com.techoffice.Services.dto.CoRequestPartyDTO;

public interface CoRequestPartyService {
    CoRequestPartyDTO add(CoRequestPartyDTO reqDto);
}
