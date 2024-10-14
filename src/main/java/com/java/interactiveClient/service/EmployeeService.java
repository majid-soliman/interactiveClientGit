package com.java.interactiveClient.service;

import java.io.IOException;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

	@Autowired
	IntegrationService integrationService; 
	
	public String saveEmployee(Map<String, Object> reqMap) throws ClientProtocolException, IOException{
		JSONObject json = new JSONObject(reqMap);
		return integrationService.getPostRequest(APIUtils.saveEmployeeUrl,json);
	}
	
	public String updateEmployee(Map<String, Object> reqMap) throws ClientProtocolException, IOException{
		JSONObject json = new JSONObject(reqMap);
		return integrationService.getPatchRequest(APIUtils.updateEmployeeUrl,json);
	}
	
	public String deleteEmployee(int id) throws ClientProtocolException, IOException{
		
		return integrationService.getDeleteRequest(APIUtils.deleteEmployeeUrl,id);
	}
}
