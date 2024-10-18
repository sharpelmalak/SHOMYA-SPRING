package iti.jets.shomya.controller;

import iti.jets.shomya.persistence.model.Order;
import iti.jets.shomya.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/orders")
public class OrderController {

@Autowired
    OrderServiceImpl orderService;

@PostMapping("/add")
    public String addOrder(@RequestBody Order order) {
    orderService.saveOrder(order);
    return "success";
}

@GetMapping("/getAll")
    public List<Order> getAllOrders() {
    return orderService.getOrders();
}

@GetMapping("/{customerID}")
    public List<Order> getOrdersByCustomerID(@PathVariable("customerID") int customerID) {
    return orderService.getOrdersByCustomer(customerID);
}

@GetMapping("/{orderID}")
public Order getOrderById(@PathVariable("orderID") int orderID) {
    return orderService.getOrder(orderID);
}


@DeleteMapping("/delete/{orderID}")
    public String deleteOrder(@PathVariable("orderID") int orderID) {
    orderService.deleteOrder(orderID);
    return "success";
}

}
