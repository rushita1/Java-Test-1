NOTE: This project was created using 'eclipse'. You can complete the assignment using any IDE of your choice. If you choose to use eclipse 
you should be able to import the project into eclipse by going to File > Import > Existing Projects Into Workspace > Browse. 
Browse the project and click Finish. If you face build errors make sure that the 'Build Path' is correctly set by in eclipse 
by going to Project > Properties > Java Build Path > Libraries. Select the appropriate Java libraries in your system. 

Problem Statement:

The Department and Employees of an organization are put into a tree data structure.
The organization tree has the following property ('TestDrive' contains an example of an organization tree)
1) Root is a department
2) A department node can have employees as well as other departments as the children
3) An Employee's parent node is always a department

The 'generateReport' method in the class 'OrgEntity' creates an object of the type 'DepartmentReport'.
The 'DepartmentReport' class has a 'Map' of a department and the list of employees in the department. 
Once the 'generateReport' returns the map would contain the current department as well as all the departments that are below it.

Below is a sample output when the 'mgmtReport.print()' is called in 'TestDrive': 
	
Department: Engineering
	John Doe
	Alfa Romeo
	Beta Tester
Department: Management
	Alpha P
Department: IT
	Charlie Tango

1) Please implement the following method in the 'DepartmentReport' class.
	
	public void addEmployeeToDepartment(String employeeName, String departmentName)
	
2) Please implement the following method in the 'OrgEntity' class.
 
	public OrgReport generateReport()

You can test your implementation by running the 'TestDrive'.