package com.om.sai.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="instititue_table")
public class InstititueDTO  implements Serializable{
	
	public InstititueDTO() {
		System.out.println("institutedto is created");
	}
	@Id
	@GenericGenerator(name="ref",strategy="increment")
	@GeneratedValue(generator="ref")
	@Column(name="instititue_id")
	private int Instituteid;
	@Column(name="instititue_name")
	private String Institutename;
	@Column(name="instititue_place")
	private String Instituteplace;
	@Column(name="instititue_fee")
	private double Institutefee;
	public int getInstituteid() {
		return Instituteid;
	}
	public void setInstituteid(int instituteid) {
		Instituteid = instituteid;
	}
	public String getInstitutename() {
		return Institutename;
	}
	public void setInstitutename(String institutename) {
		Institutename = institutename;
	}
	public String getInstituteplace() {
		return Instituteplace;
	}
	public void setInstituteplace(String instituteplace) {
		Instituteplace = instituteplace;
	}
	public double getInstitutefee() {
		return Institutefee;
	}
	public void setInstitutefee(double institutefee) {
		Institutefee = institutefee;
	}
	
	

}
