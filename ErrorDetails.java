package com.example.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
	
public ErrorDetails(Date date, String message2, String description) {
		// TODO Auto-generated constructor stub
	}
private Date timeStamp;
private String message;
private String details;

}
