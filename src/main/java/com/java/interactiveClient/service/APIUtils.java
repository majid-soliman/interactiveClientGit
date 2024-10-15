package com.java.interactiveClient.service;

public class APIUtils {

	public static final String saveEmployeeUrl="http://localhost:8080/employeeAPI/saveEmployee";
	public static final String updateEmployeeUrl="http://localhost:8080/employeeAPI/updateEmployee";
	public static final String deleteEmployeeUrl="http://localhost:8080/employeeAPI/deleteEmployee?id=";

	public static final String saveDepartmentUrl="http://localhost:8080/departmentAPI/saveDepartment";
	public static final String updateDepartmentUrl="http://localhost:8080/departmentAPI/updateDepartment";
	public static final String deleteDepartmentUrl="http://localhost:8080/departmentAPI/deleteDepartment?id=";

	public static final String getAllEmployeesUrl="http://localhost:8080/employeeAPI/getAllEmployees?";
	public static final String getAllDepartmentsUrl="http://localhost:8080/departmentAPI/getAllDepartment?";
}
