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

import com.java.interactiveClient.service.DepartmentService;

@RestController
@RequestMapping("/departmentClientAPI")
@CrossOrigin("*")

public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	@PostMapping("/saveDepartment")
	public String saveDepartment(@RequestBody Map<String, Object> reqMap) throws ClientProtocolException, IOException{
     return service.saveDepartment(reqMap);		
	}
	
	@PostMapping("/updateDepartment")
	public String updateDepartment(@RequestBody Map<String, Object> reqMap) throws ClientProtocolException, IOException{
     return service.updateDepartment(reqMap);		
	}
	
	@PostMapping("/deleteDepartment")
	public String deleteDepartment(@RequestParam int id) throws ClientProtocolException, IOException{
     return service.deleteDepartment( id);		
	}
}
