package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_offers")
public class Offers implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name="etitle",nullable = false,length = 30)
	private String title;
	
	@Column(name="ecompany",nullable = false,length = 30)
	private String company;
	
	@Column(name = "eopen",nullable = false,length=9)
	private int openings;
	
	@Column(name="elocation",nullable = false,length=20)
	private String location;
	
	@Column(name="esalary",nullable = false,length = 7)
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getOpenings() {
		return openings;
	}

	public void setOpenings(int openings) {
		this.openings = openings;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
