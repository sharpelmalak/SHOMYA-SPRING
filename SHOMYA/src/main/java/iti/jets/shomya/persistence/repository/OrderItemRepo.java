//package iti.jets.shomya.persistence.repository;
//
//import iti.jets.shomya.persistence.model.OrderItem;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface OrderItemRepo extends JpaRepository<OrderItem, Long> {
//    List<OrderItem> findByOrderId(Long orderId);
//    List<OrderItem> findByOrderIdAndUserId(Long orderId, Long userId);
//    @Override
//    List<OrderItem> findAll();
//}
