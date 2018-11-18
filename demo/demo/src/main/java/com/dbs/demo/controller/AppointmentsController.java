package com.dbs.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.demo.bean.AppointmentBean;
import com.dbs.demo.bean.CustomerBean;
import com.dbs.demo.repository.AppointmentsBeanRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AppointmentsController {

	@Autowired
	public AppointmentsBeanRepository appointmentsBeanRepository;

	@GetMapping("/appReqToUser")
	public List<AppointmentBean> getIncomingAppointmentsToUser(@RequestBody CustomerBean customerBean) {
		return appointmentsBeanRepository.getAppointmentForUser(customerBean.getMailID());
	}

	@GetMapping("/getReqFromUser")
	public List<AppointmentBean> getOutgoingAppointmentsFromUserToAdmin(@RequestBody CustomerBean customerBean) {
		return appointmentsBeanRepository.getAppointmentBYuser(customerBean.getMailID());
	}

	@PostMapping("appointment")
	public void setAppointment(@RequestBody AppointmentBean appointmentBean) {
		appointmentsBeanRepository.save(appointmentBean);
	}

	@GetMapping("/getReqToAdmin")
	public List<AppointmentBean> getIncomingAppointmentsToAdmin() {
		return appointmentsBeanRepository.getAppointmentForWM();
	}

	@GetMapping("/getReqFromAdmin")
	public List<AppointmentBean> getIncomingAppointmentsFromAdmin() {
		return appointmentsBeanRepository.getAppointmentsToAdmin();
	}
}
