package com.userservice.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name="micro_users")
public class User {

	@Id
	@Column(name="Id")
	private String userId;
	
	@Column(name="name",length = 20)
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="about")
	private String about;
	
	@Transient
	private  List<Rating> ratings = new ArrayList<>(); 
}
