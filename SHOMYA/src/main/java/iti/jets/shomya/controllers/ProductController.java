package iti.jets.shomya.controllers;

import iti.jets.shomya.persistence.model.Product;
import iti.jets.shomya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
@Autowired
private ProductService productService;
@GetMapping
public List<Product> getAllproducts()
{
  return productService.getAllProducts();
}

  @GetMapping("/{id}")
  public ResponseEntity<Product> getproducts(@PathVariable int id)
  {
    Product p=  productService.getProduct(id);
    if(p !=null)
      return ResponseEntity.ok(p);
    return ResponseEntity.notFound().build();
  }

 @PostMapping
  public ResponseEntity<Product>saveProducts(@RequestBody Product product){
  return ResponseEntity.ok(productService.CreateProduct(product));
 }

}
