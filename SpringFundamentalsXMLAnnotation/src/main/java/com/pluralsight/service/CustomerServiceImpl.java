package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nadi on 20/12/2017.
 */

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //@Autowired
    private CustomerRepository customerRepository;

    //@Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("In a setter......");
        this.customerRepository = customerRepository;
    }

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        System.out.println("In a constructor......");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

}
