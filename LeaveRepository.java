package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.LeaveDetail;

@Repository
public interface LeaveRepository extends JpaRepository<LeaveDetail, Long>{
	
	LeaveDetail[] findByEmployeeId(String employeeId);

    LeaveDetail findByEmployeeIdAndFromdate(String employeeId,String fromdate);

}
