//package iti.jets.shomya.service.impl;
//
//import iti.jets.shomya.persistence.model.OrderItem;
//import iti.jets.shomya.persistence.repository.OrderItemRepo;
//import iti.jets.shomya.service.OrderItemService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class OrderItemServiceImpl implements OrderItemService {
//    @Autowired
//    OrderItemRepo orderItemRepo;
//
//    @Override
//    public List<OrderItem> findAll() {
//        return orderItemRepo.findAll();
//    }
//
//    @Override
//    public List<OrderItem> findByOrderId(long orderId) {
//        return orderItemRepo.findByOrderId(orderId);
//    }
//
//    @Override
//    public OrderItem save(OrderItem orderItem) {
//        return orderItemRepo.save(orderItem);
//    }
//
//    @Override
//    public String delete(long orderId) {
//        orderItemRepo.deleteById(orderId);
//        return "Order item deleted";
//
//
//    }
//    @Override
//    public OrderItem update(OrderItem orderItem) {
//        return orderItemRepo.save(orderItem);
//    }
//}
