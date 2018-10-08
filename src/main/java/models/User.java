package com.delta.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="delta_users")
public class User implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
    private LocalDate last_login;
    private LocalDate last_update;
    private String fname;
    private String lname;
    private Integer usertype;
	
    public User(){

    }
    public Integer getId(){
	return id;
    }
    public String getEmail(){
	return email;
    }
    public String getPassword(){
	return password;
    }
    public LocalDate getLastLogin(){
	return last_login;
    }
    public LocalDate getLastUpdate(){
	return last_update;
    }
    public Integer getUserType(){
	return usertype;
    }
    public String getFname(){
	return fname;
    }
    public String getLname(){
	return lname;
    }
    public void setEmail(String email) { this.email = email;}
    public void setPassword(String pasword) {this.password = password;}
    //public void set(Integer groupId){this.grouId = groupId;}
    public void setLastLogin(LocalDate last_login){this.last_login = last_login;}
    public void setLastUpdate(LocalDate last_update){this.last_update=last_update;}
    public void setFname(String fname){	this.fname = fname;}
    public void setLname(String lname){ this.lname = lname;}
    public void setUserType(Integer usertype){this.usertype = usertype;}
    
}
