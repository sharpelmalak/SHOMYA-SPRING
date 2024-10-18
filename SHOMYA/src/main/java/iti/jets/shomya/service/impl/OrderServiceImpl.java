package iti.jets.shomya.service.impl;

import iti.jets.shomya.persistence.model.Order;
import iti.jets.shomya.persistence.repository.OrderRepo;
import iti.jets.shomya.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Override
    public ArrayList<Order> getOrders() {
        return (ArrayList<Order>) orderRepo.findAll();
    }

    @Override
    public Order getOrder(int id) {
        return orderRepo.getOne(id);
    }

    @Override
    public void saveOrder(Order order) {
        orderRepo.save(order);
    }

    @Override
    public void deleteOrder(int id) {
        orderRepo.deleteById(id);
    }

    @Override
    public ArrayList<Order> getOrdersByCustomer(int customerId) {
        return (ArrayList<Order>) orderRepo.allByCustomerId(customerId);
    }

    @Override
    public Order updateOrder(Order order) {
        return orderRepo.save(order); // This will update the order if it exists
    }

}
