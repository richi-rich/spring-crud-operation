package com.capgemini.crudDemo.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	String name;
	String id;
	
	Employee() {
	}
	
	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		
}
