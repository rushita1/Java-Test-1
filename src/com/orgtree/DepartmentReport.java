package com.orgtree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentReport {

	private Map<String, List<String>> departmentEmpMap = new HashMap<String, List<String>>();
	private List<String> mgmtEmployeeList = new ArrayList<>();
	private List<String> engEmployeeList = new ArrayList<>();
	private List<String> itEmployeeList = new ArrayList<>();
	
	//TODO: Please implement this method
	public void addEmployeeToDepartment(String employeeName, String departmentName){
		
		if(departmentName.equals("Management")){
			mgmtEmployeeList.add(employeeName);
			departmentEmpMap.put(departmentName, mgmtEmployeeList);
		}
		else if(departmentName.equals("Engineering")){
			engEmployeeList.add(employeeName);
			departmentEmpMap.put(departmentName, engEmployeeList);
		}	
		else if(departmentName.equals("IT")){
			itEmployeeList.add(employeeName);
			departmentEmpMap.put(departmentName, itEmployeeList);
		}	
	}
	
	public void print(){
		for(String d:departmentEmpMap.keySet()){
			System.out.println("Department: " + d);
			for(String e:departmentEmpMap.get(d)){
				System.out.println("\t" + e);
			}
		}
	}
	
}
