package com.dbs.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.demo.bean.CustomerBean;
import com.dbs.demo.bean.LoginBean;
import com.dbs.demo.repository.CustomerBeanRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class CustomerController {

	@Autowired
	public CustomerBeanRepository customerBeanRepository;

	@GetMapping("customers")
	public List<CustomerBean> getCustomers() {
		return customerBeanRepository.findAll();
	}

	@GetMapping("/login")
	public String getLoginStatus(@RequestBody LoginBean loginBean) {
		String response = "F";
		String username = loginBean.getMailId();
		String password = loginBean.getPassword();
		CustomerBean customerBean = new CustomerBean();
		customerBean = customerBeanRepository.validateUser(username, password);
		if (customerBean != null) {
			response = "T";
		}
		return response;
	}

	@PostMapping("signupCustomer")
	public void insertRecord(@RequestBody CustomerBean customerBean) {
		customerBeanRepository.save(customerBean);
	}
}
