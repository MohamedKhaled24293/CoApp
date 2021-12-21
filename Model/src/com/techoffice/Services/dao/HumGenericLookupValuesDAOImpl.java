package com.techoffice.Services.dao;

import com.techoffice.Services.entity.HumGenericLookupValues;

import java.math.BigDecimal;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HumGenericLookupValuesDAOImpl implements HumGenericLookupValuesDAO {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Model");
        EntityManager em=emf.createEntityManager();
    @Override
    public Map<String, Long> incommingEntity() {
               if(!em.getTransaction().isActive())
               em.getTransaction().begin();
               Map<String,Long> incommingEntity=new HashMap<>();
               String sqlquery = "SELECT e.valueTitle, e.id from HumGenericLookupValues e WHERE e.humGenericLookup.id=116";
               Query query =em.createQuery(sqlquery);
               List<Object[]> result = query.getResultList();
               for (Object[] res : result)
                   incommingEntity.put((String) res[0], ((Long)res[1]).longValue());
               
                return incommingEntity;
           }
    public Map<String, Long> receivingTypes() {
               if(!em.getTransaction().isActive())
               em.getTransaction().begin();
               Map<String,Long> receivingType=new HashMap<>();
               String sqlquery = "SELECT e.valueTitle, e.id from HumGenericLookupValues e WHERE e.humGenericLookup.id=56";
               Query query =em.createQuery(sqlquery);
               List<Object[]> result = query.getResultList();
               for (Object[] res : result)
                   receivingType.put((String) res[0], ((Long)res[1]).longValue());
               
                return receivingType;
           }
    
    public Map<String, Long> applicantTypes() {
        if(!em.getTransaction().isActive())
            em.getTransaction().begin();
        Map<String,Long> applicants=new HashMap<>();
        Query query=em.createQuery("SELECT e.valueTitle, e.id from HumGenericLookupValues e WHERE e.humGenericLookup.id= 50");
        List<Object[]> result = query.getResultList();
        for (Object[] res : result)
            applicants.put((String) res[0], ((Long)res[1]).longValue());
        
         return applicants;

    }


    @Override
    public Map<String, Long> applicantNationality() {
        if(!em.getTransaction().isActive())
            em.getTransaction().begin();
        Map<String,Long> nationality=new HashMap<>();
        Query query=em.createQuery("SELECT e.valueTitle, e.id from HumGenericLookupValues e WHERE e.humGenericLookup.id= 6");
        List<Object[]> result = query.getResultList();
        for (Object[] res : result)
            nationality.put((String) res[0], ((Long)res[1]).longValue());
        
         return nationality;
    }

    @Override
    public Map<String, Long> applicantGender() {
        if(!em.getTransaction().isActive())
            em.getTransaction().begin();
        Map<String,Long> gender=new HashMap<>();
        Query query=em.createQuery("SELECT e.valueTitle, e.id from HumGenericLookupValues e WHERE e.humGenericLookup.id= 7");
        List<Object[]> result = query.getResultList();
        for (Object[] res : result)
            gender.put((String) res[0], ((Long)res[1]).longValue());
        
        return gender;
    }
    
    
}
