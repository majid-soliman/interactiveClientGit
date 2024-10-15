package com.java.interactiveClient.controller;

import java.io.IOException;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.interactiveClient.service.EmployeeService;

@RestController
@RequestMapping("/employeeClientAPI")
@CrossOrigin("*")

public class EmployeeController {


	@Autowired
	EmployeeService service;
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Map<String, Object> reqMap) throws ClientProtocolException, IOException{
     return service.saveEmployee(reqMap);		
	}
	
	@PostMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Map<String, Object> reqMap) throws ClientProtocolException, IOException{
     return service.updateEmployee(reqMap);		
	}
	
	@PostMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam int id) throws ClientProtocolException, IOException{
     return service.deleteEmployee( id);		
	}
	
	@PostMapping("/getAllEmployees")
	public String getAllEmployees(@RequestParam int pageNo,@RequestParam int pageSize) 
	throws ClientProtocolException, IOException{
     return service.getAllEmployees(pageNo,pageSize);		
	}
	

}
