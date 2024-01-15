package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.serviceimpl.LeaveService;

@RestController
@RequestMapping(path = "/leavedetail")
public class LeaveController {
	
	@Autowired
    LeaveService leaveservice;

	@GetMapping(path = "/findbyempidleave")
    
    @ResponseBody
    public ResponseEntity<?> findByEmployeeId(@RequestParam String employeeId) {
		HttpHeaders headers = new HttpHeaders();
    	
	    try {
	    
	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(leaveservice.findByEmployeeId(employeeId));
	    }catch (Exception e) {
			// TODO: handle exception
	    	headers.add("Message", "false");
	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the user");
		}
       
    }
}
