package com.hotelservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="holet_service")
public class Hotel {

	@Id
	private String id;
	private String name;
	private String location;
	private String about;
}
