package com.example.demo.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="STUDENT_SYSTEM")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
	private int id;
	private String name ;
	private String address;
	private String email;
	private String phone;
	private float adhar;
	private String blood;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public float getAdhar() {
		return adhar;
	}
	public void setAdhar(float adhar) {
		this.adhar = adhar;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phone=" + phone
				+ ", adhar=" + adhar + ", blood=" + blood + "]";
	}

	
}
