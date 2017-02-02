package com.javabycode.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_DETAIL")
public class StudentDetail {

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "SCHOOL")
	private String school;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "POST_CODE")
	private String postCode;

	public StudentDetail() {

	}

	public StudentDetail(String firstName, String lastName, String gender, String school, String address,
			String postCode, String country) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.school = school;
		this.address = address;
		this.postCode = postCode;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ",firstName=" + firstName + ",lastName=" + lastName + ",gender=" + gender
				+ ", address=" + address + ", country=" + country + ", postCode=" + postCode + "]";
	}

}
