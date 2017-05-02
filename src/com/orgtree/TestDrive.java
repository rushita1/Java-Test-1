package com.orgtree;

import com.orgtree.Department;

public class TestDrive {

	public static void main(String[] args){		
		
        Employee e1 = new Employee("John", "Doe", "247-890-8410");
        Employee e2 = new Employee("Alfa", "Romeo", "203-111-2222");
        Employee e3 = new Employee("Beta", "Tester", "480-123-4567");
        Employee e4 = new Employee("Charlie", "Tango", "480-786-1387");
        Employee e5 = new Employee("Alpha", "P", "480-001-0002");
        
        Department departmentMgmt = new Department("Management", "100-123-8901");
        Department departmentEngg = new Department("Engineering", "200-222-3333");
        Department departmentIT = new Department("IT", "300-456-8901");
        
        departmentMgmt.addChild(e5);
        departmentMgmt.addChild(departmentEngg);
        departmentMgmt.addChild(departmentIT);
        
        departmentEngg.addChild(e1);
        departmentEngg.addChild(e2);
        departmentEngg.addChild(e3);
        
        departmentIT.addChild(e4);
		
        
        // Report
		DepartmentReport mgmtReport = OrgEntity.generateReport(departmentMgmt);
		mgmtReport.print();
		
	}
	
}
