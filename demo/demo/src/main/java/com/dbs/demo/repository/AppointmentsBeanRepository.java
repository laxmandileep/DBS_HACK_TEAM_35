package com.dbs.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dbs.demo.bean.AppointmentBean;

public interface AppointmentsBeanRepository extends JpaRepository<AppointmentBean, String> {

	// gets appointment requests for users
	@Query("select p from AppointmentBean p where p.owner =:mailID")
	public List<AppointmentBean> getAppointmentBYuser(@Param("mailID") String paramString1);

	// get requests for admin from users
	@Query("select p from AppointmentBean p where p.appTo like 'admin'")
	public List<AppointmentBean> getAppointmentForWM();

	// get incoming requests to user by user
	@Query("select p from AppointmentBean p where p.appTo = mailID")
	public List<AppointmentBean> getAppointmentForUser(@Param("mailID") String paramString1);

	@Query("select p from AppointmentBean p where p.appFrom = admin")
	public List<AppointmentBean> getAppointmentsToAdmin();
}
