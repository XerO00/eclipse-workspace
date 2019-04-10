package org.koushik.javabrains.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
    @Id
	private int userId=1;
	private String userName;
	
	public int getId() {
		return userId;
	}
	public void setId(int id) {
		this.userId = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
