package com.bankapp.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "user_table")
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer uid;
	 
	 @NotEmpty(message = "username can not be left blank")
	 @Column(unique = true, nullable = false)
	 private String username;
	 
	 @NotEmpty(message = "password can not be left blank")
	 private String password;
	 
	 @Enumerated(EnumType.STRING)
	 @NotBlank(message = "enum can not be left blank")
	 private UserType userType;
	 
	 @Column(nullable = false)
	 @NotEmpty(message = "address can not be left blank")
	 private String address;
	 
	 @Column(nullable = false)
	 @NotEmpty(message = "phone can not be left blank")
	 private String phone;
	 
	 @Column(nullable = false)
	 @NotEmpty(message = "email can not be left blank")
	 private String  email;
	 
	 
	public User() {
	}

	public User(String username, String password, UserType userType, String address, String phone, String email) {
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [uid=");
		builder.append(uid);
		builder.append(", username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", userType=");
		builder.append(userType);
		builder.append(", address=");
		builder.append(address);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
}