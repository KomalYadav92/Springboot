package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "leavedetail")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LeaveDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "employeeId")
	String employeeId;
	
	@Column(name = "leavereason")
	String leavereason;
	
	@Column(name = "date")
	String date;

	@Column(name = "fromdate")
	String fromdate;

	@Column(name = "todate")
	String todate;

	@Column(name = "leavetype")
	String leavetype;
	
	@Column(name = "type")
	String type;

}
