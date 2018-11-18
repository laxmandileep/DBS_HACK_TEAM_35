package com.dbs.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.demo.bean.AppointmentBean;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AppointmentsController {

	@GetMapping("/")
	public AppointmentBean getAppointmentsForUser(){
		
		return null;
	}
}
