package com.jsp.medishop.dao;

import java.util.List;

import com.jsp.medishop.dto.Customer;

public interface CustomerDao {

	public Customer saveCustomerDao(Customer customer);

	public Customer getCustomerByIdDao(int customerId);

	public List<Customer> getAllCustomerDao();

	public Customer getCustomerByEmailDao(String customerEmail);

	public Customer updateCustomerByEmailDao(Customer customer);

	public Customer deleteCustomerByIdDao(int customerId);

}
