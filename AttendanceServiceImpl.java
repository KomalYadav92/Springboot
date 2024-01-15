package com.example.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.AttendanceDetail;
import com.example.repository.AttendanceRepository;

@Service
public class AttendanceServiceImpl {
	
	@Autowired
	private AttendanceRepository attendancerepository;
	
	public AttendanceDetail[] findByempid(String employeeid) {
		AttendanceDetail[] attendanceList =  attendancerepository.findByEmployeeId(employeeid);

	        if (attendanceList != null) {
	            return attendanceList;
	        }
	        return null;
	  }
	
	
}
