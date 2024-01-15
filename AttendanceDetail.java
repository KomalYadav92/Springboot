package com.example.entity;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name="attendancedetail")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceDetail {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String employeeId;
	
	private String month;
	
	private String date;		
	
	private Boolean available;
	
	private String checkin;
	
	private String checkout;
	
	private long attencount;

}
