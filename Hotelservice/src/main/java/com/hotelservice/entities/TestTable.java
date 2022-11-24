package com.hotelservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Holet_Service")
public class TestTable {
	@Id
	@Column(name="Id")
	private String userId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
}
