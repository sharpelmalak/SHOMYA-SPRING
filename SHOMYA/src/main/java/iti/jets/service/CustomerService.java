package iti.jets.service;

import iti.jets.persistence.model.Customer;
import iti.jets.persistence.repositery.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerService {

    private CustomerRepo customerRepo;


    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    public Customer findById(int id) {
        return customerRepo.findById(id).get();
    }

    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }

    public void delete(Customer customer) {
        customerRepo.delete(customer);
    }

    public void deleteById(int id) {
        customerRepo.deleteById(id);
    }

    
}
