package com.pavan.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master_table")
public class MasterTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long S_No;

	private String Zone;
	private String District;
	private String town;
	private String New_TOWN;
	private String retailer_name;
	private String retailer_mobile;
	private String Name_of_TSM;
	private String Contact_no_of_TSM_;
	private String Name_of_ASM;
	private String Contact_no_of_ASM_;

	public MasterTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public MasterTable(long s_No, String zone, String district, String town, String new_TOWN, String retailer_name,
			String retailer_mobile, String name_of_TSM, String contact_no_of_TSM_, String name_of_ASM,
			String contact_no_of_ASM_) {
		super();
		S_No = s_No;
		Zone = zone;
		District = district;
		town = town;
		New_TOWN = new_TOWN;
		this.retailer_name = retailer_name;
		this.retailer_mobile = retailer_mobile;
		Name_of_TSM = name_of_TSM;
		Contact_no_of_TSM_ = contact_no_of_TSM_;
		Name_of_ASM = name_of_ASM;
		Contact_no_of_ASM_ = contact_no_of_ASM_;
	}




	public long getS_No() {
		return S_No;
	}

	public void setS_No(long s_No) {
		S_No = s_No;
	}

	public void setS_No(int s_No) {
		S_No = s_No;
	}

	public String getZone() {
		return Zone;
	}

	public void setZone(String zone) {
		Zone = zone;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		town = town;
	}

	public String getNew_TOWN() {
		return New_TOWN;
	}

	public void setNew_TOWN(String new_TOWN) {
		New_TOWN = new_TOWN;
	}

	public String getRetailer_name() {
		return retailer_name;
	}

	public void setRetailer_name(String retailer_name) {
		this.retailer_name = retailer_name;
	}

	public String getRetailer_mobile() {
		return retailer_mobile;
	}

	public void setRetailer_mobile(String retailer_mobile) {
		this.retailer_mobile = retailer_mobile;
	}

	public String getName_of_TSM() {
		return Name_of_TSM;
	}

	public void setName_of_TSM(String name_of_TSM) {
		Name_of_TSM = name_of_TSM;
	}

	public String getContact_no_of_TSM_() {
		return Contact_no_of_TSM_;
	}

	public void setContact_no_of_TSM_(String contact_no_of_TSM_) {
		Contact_no_of_TSM_ = contact_no_of_TSM_;
	}

	public String getName_of_ASM() {
		return Name_of_ASM;
	}

	public void setName_of_ASM(String name_of_ASM) {
		Name_of_ASM = name_of_ASM;
	}

	public String getContact_no_of_ASM_() {
		return Contact_no_of_ASM_;
	}

	public void setContact_no_of_ASM_(String contact_no_of_ASM_) {
		Contact_no_of_ASM_ = contact_no_of_ASM_;
	}
}
