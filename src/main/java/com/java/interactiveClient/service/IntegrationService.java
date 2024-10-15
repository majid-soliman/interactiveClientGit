package com.java.interactiveClient.service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class IntegrationService {

public static CloseableHttpClient client = HttpClients.createDefault();
	
    @Autowired
	static
     RestTemplate restTemplate;
	
	public static String getPostRequest(String url, JSONObject json) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(url);
		StringEntity s = new StringEntity(json.toString(),"UTF-8");
		s.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
		post.setEntity(s);
		post.setHeader("Content-Type", "application/json");
		CloseableHttpResponse response = client.execute(post);
		HttpEntity entity = response.getEntity();
		String result = null;
		if(entity!=null) {
		    result = EntityUtils.toString(entity);
			System.out.println("Result: "+result);
		}
		return result;
		}
	
	public static String getPatchRequest(String url, JSONObject json) throws ClientProtocolException, IOException {
		HttpPatch patch = new HttpPatch(url);
		StringEntity s = new StringEntity(json.toString(),"UTF-8");
		s.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
		patch.setEntity(s);
		patch.setHeader("Content-Type", "application/json");
		CloseableHttpResponse response = client.execute(patch);
		HttpEntity entity = response.getEntity();
		String result = null;
		if(entity!=null) {
		    result = EntityUtils.toString(entity);
			System.out.println("Result: "+result);
		}
		return result;
		}
	
	public static String getDeleteRequest(String url, int id) throws ClientProtocolException, IOException {
		url = url+id;
		HttpDelete delete = new HttpDelete(url);
		delete.setHeader("Content-Type", "application/json");
		CloseableHttpResponse response = client.execute(delete);
		HttpEntity entity = response.getEntity();
		String result = null;
		if(entity!=null) {
		    result = EntityUtils.toString(entity);
			System.out.println("Result: "+result);
		}
		return result;   
		}
	
	public static String getAllPagenationRequest(String url) throws ClientProtocolException, IOException {
		HttpGet get= new HttpGet(url);
		get.setHeader("Content-Type", "application/json");
		CloseableHttpResponse response = client.execute(get);
		HttpEntity entity = response.getEntity();
		String result = null;
		if(entity!=null) {
		    result = EntityUtils.toString(entity);
			System.out.println("Result: "+result);
		}
		return result;   
		}
	
	
}
