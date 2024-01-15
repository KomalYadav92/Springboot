package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.AttendanceDetail;
import com.example.entity.Employee;

import jakarta.transaction.Transactional;


public interface AttendanceRepository extends JpaRepository<AttendanceDetail, Long>{
	AttendanceDetail[] findByEmployeeId(String employeeid);
	
	@Query(value = "SELECT employeeId,count(available) as total FROM attendancedetail where available=1 and month = ?2 and shift = ?3 group by employee_id order by count(available) desc")
	Object[] findByAttencountOrderByAttencountAsc(String departmentid,String month,String shift);
}
