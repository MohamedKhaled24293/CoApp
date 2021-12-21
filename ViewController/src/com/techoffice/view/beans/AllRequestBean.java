package com.techoffice.view.beans;

import com.techoffice.Services.client.CoRequestClient;
import com.techoffice.Services.client.CoRequestClientImpl;
import com.techoffice.Services.client.GeneralClient;
import com.techoffice.Services.client.GeneralClientImpl;
import com.techoffice.Services.dto.CoRequestDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "allRequestBean")
public class AllRequestBean {
    List<CoRequestDTO> reqDtoList =new ArrayList<>();
    Map<String,Long>countries=new HashMap<>();
    CoRequestClient reqClient=new CoRequestClientImpl();
    GeneralClient genClient=new GeneralClientImpl();
    
    @PostConstruct
    public void init() {

        reqDtoList=reqClient.findAllRequests();
    }

    public void setReqDtoList(List<CoRequestDTO> reqDtoList) {
        this.reqDtoList = reqDtoList;
    }

    public List<CoRequestDTO> getReqDtoList() {
        return reqDtoList;
    }

    public void setReqClient(CoRequestClient reqClient) {
        this.reqClient = reqClient;
    }

    public CoRequestClient getReqClient() {
        return reqClient;
    }
}
