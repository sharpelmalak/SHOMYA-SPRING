package iti.jets.shomya.service;

import iti.jets.shomya.persistence.model.Order;

import java.util.ArrayList;

public interface OrderService {
    ArrayList<Order> getOrders();
    Order getOrder(int id);
    void saveOrder(Order order);
    void deleteOrder(int id);
    ArrayList<Order> getOrdersByCustomer(int customerId);

}
