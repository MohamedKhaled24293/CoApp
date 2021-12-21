package com.techoffice.Services.service;

import com.techoffice.Services.dao.CoRequestPartyDAO;
import com.techoffice.Services.dao.CoRequestPartyDAOImpl;
import com.techoffice.Services.dto.CoRequestPartyDTO;

public class CoRequestPartyServiceImpl implements CoRequestPartyService {
    CoRequestPartyDAO dao =new CoRequestPartyDAOImpl();

    @Override
    public CoRequestPartyDTO add(CoRequestPartyDTO reqDto) {
        // TODO Implement this method
        return dao.add(reqDto);
    }
}
