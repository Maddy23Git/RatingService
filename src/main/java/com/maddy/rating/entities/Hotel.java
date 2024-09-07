package com.maddy.rating.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@SequenceGenerator(name = "hotel_seq", initialValue = 1000, allocationSize = 1)
@Table(name = "hotel")
public class Hotel {

	@Id
	@Column(name = "hotel_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "hotel_seq")
	private Integer hotelId;
	private String name;
	private String location;
	private String about;

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

}
