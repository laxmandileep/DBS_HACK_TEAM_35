package com.dbs.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dbs.demo.bean.AppointmentBean;

public interface AppointmentsBeanRepository extends JpaRepository<AppointmentBean, String>{

	//gets appointment requests for users
	@Query("select p from AppointmentBean p where p.mailID =:mailID")
	public AppointmentBean getAppointmentBYuser(@Param("mailID") String paramString1);

	//get requests for admin from users
	@Query("select p from AppointmentBean p where p.from !=admin")
	public AppointmentBean getAppointmentForWM();

	//get incoming requests to user by user
	@Query("select p from AppointmentBean p where p.to = mailID")
	public AppointmentBean getAppointmentForUser(@Param("mailID") String paramString1);
	
}
