package com.techoffice.Mapping;

    import java.util.ArrayList;
    import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;


public class ConvertUtil {

        private ConvertUtil() {
        }

        private static ModelMapper modelMapper = new ModelMapper();
        
        static {
            modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        }
        
        public static <T> T convertToDto(Object entity, Class<T> dtoClazz) {
            
            if (entity != null)
                return modelMapper.map(entity, dtoClazz);
            else 
                return null;
        }

        public static <T> T convertToEntity(Object dto, Class<T> entityClazz) {
            if (dto != null)
                return modelMapper.map(dto, entityClazz);
            else 
                return null;
        }
        
        public static <T> List<T> convertToDtoList(List<Object> entityList, Class<T> dtoClazz) {
            List<T> res = new ArrayList<>();
            for(Object eo : entityList)
            if (eo != null)
                res.add(modelMapper.map(eo, dtoClazz));
           
           return res;
        }
        

    }


