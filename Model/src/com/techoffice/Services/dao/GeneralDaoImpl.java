package com.techoffice.Services.dao;

import java.math.BigDecimal;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

public class GeneralDaoImpl implements GeneralDao {
 
      EntityManagerFactory emf= Persistence.createEntityManagerFactory("Model");
      EntityManager em=emf.createEntityManager();
          
    @Override
    public Map<String, Long> getType() {
        if(!em.getTransaction().isActive())
        em.getTransaction().begin();
        Map<String,Long> getTypeMap=new HashMap<>();
        String sqlquery = "SELECT FILE_TYPE ,ID FROM CO_FILES";
        Query query =em.createNativeQuery(sqlquery);
        List<Object[]> result = query.getResultList();
                
        for (Object[] res : result)
            getTypeMap.put((String) res[0], ((BigDecimal)res[1]).longValue());

         return getTypeMap;
    }
   //        String query = "select Id , name from LKP_COUNTRIES ";

    @Override
    public Map<String, Long> fetchCountry() {
        if(!em.getTransaction().isActive())
        em.getTransaction().begin();
        Map<String,Long> getCountryMap=new HashMap<>();
        String sqlquery = "SELECT NAME , ID FROM LKP_COUNTRIES";
        Query query =em.createNativeQuery(sqlquery);
        List<Object[]> result = query.getResultList();
        for (Object[] res : result)
            getCountryMap.put((String) res[0], ((BigDecimal)res[1]).longValue());
        
         return getCountryMap;
    
    }
    //select id , name from LKP_CITIES

    @Override
    public Map<String, Long> fetchCity() {
        if(!em.getTransaction().isActive())
        em.getTransaction().begin();
        Map<String,Long> getCityyMap=new HashMap<>();
        String sqlquery = "SELECT NAME , ID FROM LKP_CITIES";
        Query query =em.createNativeQuery(sqlquery);
        List<Object[]> result = query.getResultList();
        for (Object[] res : result)
            getCityyMap.put((String) res[0], ((BigDecimal)res[1]).longValue());
        
         return getCityyMap;
    }
    ////"select ID , ATTACHMENT_TYPE_NAME from ATTACHMENTS_TYPE "
    @Override
    public Map<String, Long> attachtTypes() {
        if(!em.getTransaction().isActive())
        em.getTransaction().begin();
        Map<String,Long> attach=new HashMap<>();
        String sqlquery = "SELECT ATTACHMENT_TYPE_NAME , ID  from ATTACHMENTS_TYPE ";
        Query query =em.createNativeQuery(sqlquery);
        List<Object[]> result = query.getResultList();
        for (Object[] res : result)
            attach.put((String) res[0], ((BigDecimal)res[1]).longValue());
        
         return attach;
    }
    
}
