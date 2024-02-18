package com.learning.ooad2.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(value = "isActive")
public class Student {
	
	@JsonProperty("name")
	String name;
	
	@JsonProperty("isActive")
	boolean isActive;
	
	List<Integer> phoneNo;
	
	BatchInfo batch;

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

//	public boolean isActive() {
//		return isActive;
//	}
//
//	public void setActive(boolean isActive) {
//		this.isActive = isActive;
//	}

	public List<Integer> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(List<Integer> phoneNo) {
		this.phoneNo = phoneNo;
	}

	public BatchInfo getBatch() {
		return batch;
	}

	public void setBatch(BatchInfo batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", isActive=" + isActive + ", phoneNo=" + phoneNo + ", batch=" + batch + "]";
	}
	
}
