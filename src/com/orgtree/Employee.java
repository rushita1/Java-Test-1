package com.orgtree;

public class Employee extends OrgEntity{

	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	public Employee(String firstName, String lastName, String phoneNumber) {
		super(EntityType.EMPLOYEE);
		
		this.firstName   = firstName;
		this.lastName    = lastName;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	@Override
	public String getName(){
		return firstName + " " + lastName;
	}
}
