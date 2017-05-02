package com.orgtree;

import java.util.LinkedList;
import java.util.List;

public abstract class OrgEntity {

	protected EntityType      type;
	protected OrgEntity       parent;
	protected List<OrgEntity> children;

	public OrgEntity(EntityType type){
		this.type = type;
		children = new LinkedList<OrgEntity>();
	}

	public void addChild(OrgEntity child) {
		child.parent = this;
		children.add(child);
	}

	public EntityType getType(){
		return type;
	}

	//TODO: Please implement this method
	public static DepartmentReport generateReport(Department departmentMgmt){
		DepartmentReport r = new DepartmentReport();

		for(int i =0;i<departmentMgmt.children.size();i++){
			if(departmentMgmt.children.get(i).type.equals(EntityType.EMPLOYEE))
				r.addEmployeeToDepartment(departmentMgmt.children.get(i).getName(), departmentMgmt.children.get(i).parent.getName());
			else if(departmentMgmt.children.get(i).type.equals(EntityType.DEPARTMENT)){
				if(i == departmentMgmt.children.size() - 1)
					r.addEmployeeToDepartment(departmentMgmt.children.get(i).children.get(0).getName(), departmentMgmt.children.get(i).getName());
				else{
					for(int j =0;j<departmentMgmt.children.size();j++){
						r.addEmployeeToDepartment(departmentMgmt.children.get(i).children.get(j).getName(), departmentMgmt.children.get(i).getName());
					}
				}
			}
		}

		return r;
	}

	public abstract String getName();

}
