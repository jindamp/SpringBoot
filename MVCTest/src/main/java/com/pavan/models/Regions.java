package com.pavan.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
public class Regions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String zone;
	private String district;
	private String town;

	public Regions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Regions(String zone, String district, String town) {
		super();
		this.zone = zone;
		this.district = district;
		this.town = town;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

}
