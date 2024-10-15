package com.java.interactiveClient.service;

import java.io.IOException;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	IntegrationService integrationService; 
	
	public String saveDepartment(Map<String, Object> reqMap) throws ClientProtocolException, IOException{
		JSONObject json = new JSONObject(reqMap);
		return integrationService.getPostRequest(APIUtils.saveDepartmentUrl,json);
	}
	
	public String updateDepartment(Map<String, Object> reqMap) throws ClientProtocolException, IOException{
		JSONObject json = new JSONObject(reqMap);
		return integrationService.getPatchRequest(APIUtils.updateDepartmentUrl,json);
	}
	
	public String deleteDepartment(int id) throws ClientProtocolException, IOException{
		
		return integrationService.getDeleteRequest(APIUtils.deleteDepartmentUrl,id);
	}
	
	public String getAllDepartmnets(int pageNo,int pageSize) throws ClientProtocolException, IOException{
		String url=APIUtils.getAllDepartmentsUrl+"pageNo="+pageNo+"&pageSize="+pageSize;
		return integrationService.getAllPagenationRequest(url);
	}
	
}
