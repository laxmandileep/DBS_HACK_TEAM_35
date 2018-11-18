package com.dbs.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.dbs.demo.bean.CustomerBean;

public interface CustomerBeanRepository extends JpaRepository<CustomerBean, String> {

	@Query("select p from CustomerBean p where p.mailID =:mailID and p.password=:password")
	public CustomerBean validateUser(@Param("mailID") String paramString1, @Param("password") String paramString2);

	@Modifying
	@Transactional
	@Query("update CustomerBean p set p.password=:newpassword where p.mailID =:userID and p.password=:oldpassword")
	public void changePwd(@Param("userID") String userID, @Param("oldpassword") String oldpassword,
			@Param("newpassword") String newpassword);
}
