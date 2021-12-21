package com.techoffice.Services.dao;

import com.techoffice.Mapping.ConvertUtil;
import com.techoffice.Services.dto.CoRequestDTO;

import com.techoffice.Services.entity.CoRequest;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CoRequestDAOImpl implements CoRequestDAO {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("Model");
    EntityManager em=emf.createEntityManager();
    @Override
    public List<CoRequestDTO> findPetitonId(String petNumber) {
        if(!em.getTransaction().isActive())
          em.getTransaction().begin();
        String sqlquery=("select e from CoRequest e where e.petitionNumber='"+petNumber+"'");
        Query query=em.createQuery(sqlquery);
        List<CoRequestDTO> result = query.getResultList();

        
        return result;
    }

    @Override
    public CoRequestDTO add(CoRequestDTO reqDto) {
        CoRequestDTO requestDto =new CoRequestDTO();
        if(!em.getTransaction().isActive())
          em.getTransaction().begin();
        CoRequest coRec =ConvertUtil.convertToEntity(reqDto, CoRequest.class);
         em.merge(coRec);
        em.close();
        em.getTransaction().commit();
        return ConvertUtil.convertToDto(coRec, CoRequestDTO.class);
    }

    @Override
    public List<CoRequestDTO> findAllRequests() {
               if(!em.getTransaction().isActive())
           em.getTransaction().begin();         
           Query query = em.createNamedQuery("CoRequest.findAll");  
           List<CoRequest> list =query.getResultList(); 
                  em.close();
           return ConvertUtil.convertToDtoList((List) list, (Class) CoRequestDTO.class);    }
}
