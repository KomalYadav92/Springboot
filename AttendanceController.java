package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import com.example.entity.AttendanceDetail;
import com.example.serviceimpl.AttendanceServiceImpl;

@RestController
@RequestMapping(path="/attendancedetail")
public class AttendanceController {
	
	@Autowired
	AttendanceServiceImpl attendanceserviceimpl;
	
	@GetMapping(path = "/findbyempidatten")
	
	    @ResponseBody
	    public ResponseEntity<?> findByempid(@RequestParam String employeeid) {
//		 HttpHeaders headers = new HttpHeaders();
		
		HttpHeaders headers = new HttpHeaders(null);
	        
	        try {   	
	        	
	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(attendanceserviceimpl.findByempid(employeeid));
	    }catch (Exception e) {
	    	headers.add("Message", "false");
	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the user");
		}
		  
	  }
}
