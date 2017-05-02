package com.orgtree;

public class Department extends OrgEntity{

	private String name;
	private String phoneNumber;
	
	public Department(String name, String phoneNumber) {
		super(EntityType.DEPARTMENT);
		
		this.name        = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", phoneNumber=" + phoneNumber
				+ "]";
	}

	@Override
	public String getName() {
		return name;
	}
	
}
