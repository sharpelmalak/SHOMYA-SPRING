package iti.jets.shomya.service;

import iti.jets.shomya.persistence.model.Customer;
import iti.jets.shomya.persistence.repositery.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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
        Optional<Customer> customer = customerRepo.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        }
        return null;
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
