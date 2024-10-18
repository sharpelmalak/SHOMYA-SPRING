//package iti.jets.shomya.controller;
//
//import iti.jets.shomya.persistence.model.OrderItem;
//import iti.jets.shomya.persistence.model.OrderItemId;
//import iti.jets.shomya.service.impl.OrderItemServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController("/orderItem")
//public class OrderItemController {
//    @Autowired
//    OrderItemServiceImpl orderItemService;
//
//    @PostMapping("/add")
//    public String addOrderItem(@RequestBody OrderItem orderItem) {
//        orderItemService.save(orderItem);
//        return "success";
//    }
//
//    @GetMapping("/getAll")
//    public List<OrderItem> getAllOrderItems() {
//        return orderItemService.findAll();
//    }
//
//
//    @GetMapping("/{orderID}")
//    public List<OrderItem> getOrderItem(@PathVariable long orderID) {
//        return orderItemService.findByOrderId(orderID);
//    }
//    @DeleteMapping("/{orderItemID}")
//    public String deleteOrderItem(@PathVariable long orderItemID) {
//        orderItemService.delete(orderItemID);
//        return "success";
//    }
//
//
//    //need to be edited
//    @PutMapping("/{orderItemId}")
//    public String updateOrderItem(
//            @PathVariable OrderItemId orderItemId,
//            @RequestBody OrderItem orderItem) {
//        orderItem.setId(orderItemId); // Ensure the correct ID is set
//        orderItemService.save(orderItem);
//        return "success";
//    }
//
//}
