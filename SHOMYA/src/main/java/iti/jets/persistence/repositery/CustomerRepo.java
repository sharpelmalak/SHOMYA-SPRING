package iti.jets.persistence.repositery;

import iti.jets.persistence.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
