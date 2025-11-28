package com.ani.lab_11_sep_equals;

public class Employee 
{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public int hashCode()
	{
		return this.empId;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee employee = (Employee) obj;
		
		if(this.empId == employee.empId && this.empName.equals(employee.empName))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
}
