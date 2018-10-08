package com.delta.conf;

import javax.persistence.*;

public class EntityUtil {
    private static EntityManagerFactory EMF;
    
    public static EntityManagerFactory getFactory(){
	if(EMF == null){
	    EMF = Persistence.createEntityManagerFactory("delta_unit");
	}
	return EMF;
    }
} 
