package com.mindex.challenge.data;

import com.mindex.challenge.data.Employee;
import java.text.SimpleDateFormat;

public class Compensation {
    //private String employeeId;
    private Employee employee;
    private int salary;
    private String effectiveDate;

    public Compensation(){

    }

    /*public void setEmployeeId(String employeeId){
	this.employeeId=employeeId;
    }

    public String getEmployeeId(){
	return employeeId;
    }
    */
    public void setEmployee(Employee employee){
	this.employee=employee;
    }

    public Employee getEmployee(){
	return employee;
    }

    public void setSalary(int salary){
	this.salary=salary;
    }

    public int getSalary(){
	return salary;
    }

    public void setEffectiveDate(String effectiveDate) throws Exception{
	//format date here, or throw exception
	SimpleDateFormat form=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	this.effectiveDate=form.format(form.parse(effectiveDate));
    }

    public String getEffectiveDate(){
	return effectiveDate;
    }
}
