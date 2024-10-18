package iti.jets.shomya.persistence.repository;

import iti.jets.shomya.persistence.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

    @Query("SELECT o FROM Order o WHERE o.customer.id = :customerId")
    List<Order> allByCustomerId(@Param("customerId") int customerId);
    List<Order> findAllByCustomerId(int customerId);
    long countByCustomerId(int customerId);
    @Override
    List<Order> findAll();

}
