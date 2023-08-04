package com.ars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/get")
public class GetController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/calcInfo")
	public String getCalc() {
		String url="http://localhost:8081/calc/info";
		return restTemplate.getForObject(url, String.class);
	}
	
	@PostMapping("/multiply")
	public ResponseEntity<String> multiply(@RequestBody Numbers num){
		
		String url="http://localhost:8081/calc/multiply";
		ResponseEntity<String> result = restTemplate.postForEntity
				(url, num, String.class);
		
		return result;
	}
}