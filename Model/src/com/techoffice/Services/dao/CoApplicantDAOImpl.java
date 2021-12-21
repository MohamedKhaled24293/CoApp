//package com.techoffice.Services.dao;
//
//import com.techoffice.Services.entity.HumGenericLookupValues;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//public class CoApplicantDAOImpl implements CoApplicantDAO {
//    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Model");
//    EntityManager em= emf.createEntityManager();
//
//    @Override
////    public Map<String, Long> applicantTypes() {
////        if(!em.getTransaction().isActive())
////            em.getTransaction().begin();
////        Map<String,Long> applicants=new HashMap<>();
////        Query query=em.createQuery("SELECT h FROM HumGenericLookupValues h WHERE h.genericLookupId = 50 ORDER BY h.id DESC");
////        List<HumGenericLookupValues> humGenericLookupValuesEntities = query.getResultList();
////        for (HumGenericLookupValues humGenericLookupValues : humGenericLookupValuesEntities)
////            applicants.put(humGenericLookupValues.getValueTitle(), humGenericLookupValues.getId());
////
////        
////        return applicants;
////    }
//}
///*
// * 
//            Query query =
//                entityManager.createQuery("SELECT h FROM HumGenericLookupValuesEntity h WHERE h.genericLookupId = :genericLookupId ORDER BY h.id DESC");
//            query.setParameter("genericLookupId", genericLookupId);
//            List<HumGenericLookupValuesEntity> humGenericLookupValuesEntities = query.getResultList();
//
//            for (HumGenericLookupValuesEntity humGenericLookupValuesEntity : humGenericLookupValuesEntities)
//                dynamic.put(humGenericLookupValuesEntity.getValueTitle(), humGenericLookupValuesEntity.getId());
//
//        } catch (Exception e) {
//            throw new BaseDAOException(e.getMessage());
//        }
//
//        return dynamic;
// */
