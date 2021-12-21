package com.techoffice.Services.client;

import com.techoffice.Services.dto.CoRequestPartyDTO;
import com.techoffice.Services.service.CoRequestPartyService;
import com.techoffice.Services.service.CoRequestPartyServiceImpl;

public class CoRequestPartyClientImpl implements CoRequestPartyClient {
    CoRequestPartyService service=new CoRequestPartyServiceImpl();
    @Override
    public CoRequestPartyDTO add(CoRequestPartyDTO reqDto) {
        // TODO Implement this method
        return service.add(reqDto);
    }
}
