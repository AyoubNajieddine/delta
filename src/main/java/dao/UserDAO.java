package com.delta.dao;

import javax.persistence.*;
import com.delta.models.User;
import com.delta.conf.EntityUtil;
/* Should init this as singleton */
public class UserDAO {
    //private EntityManagerFactory EMF = null;
    private static UserDAO userdao = null;
    private UserDAO(){
	
    }
    public static UserDAO getDAO(){
	if(userdao == null){
	    userdao = new UserDAO();
	}
	return userdao;
    } 
  
    public User auth(String email,String password){
	EntityManager EM = EntityUtil.getFactory().createEntityManager();
	/* Always remember that jpql use the entity name */
	Query query = EM.createQuery("SELECT u FROM User u WHERE email = :email AND password = :password");
	query.setParameter("email",email);
	query.setParameter("password",password);
	/* the return statement  will not be reached in case user was found */
	int size = query.getResultList().size();
	if(size > 0){
	    User user = (User) query.getResultList().get(0);
	    EM.close();
	    return user;
	}
	EM.close();
	return null;
    } 
}
