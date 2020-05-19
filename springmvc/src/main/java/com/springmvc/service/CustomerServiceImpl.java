package com.springmvc.service;

import java.util.List;

import com.springmvc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.CustomerDao;
import com.springmvc.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	CustomerDao customerDao;

	@Autowired
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public List<Customer> listAllCustomers() {
		return customerDao.listAllCustomers();
	}

	public void saveOrUpdate(Customer customer) {
		customerDao.saveOrUpdate(customer);
	}

	public Customer findCustomerById(int id) {
		return customerDao.findCustomerById(id);
	}

	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
	}

}
