package iti.jets.shomya.service;


import iti.jets.shomya.persistence.model.Product;
import iti.jets.shomya.persistence.repositery.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
   @Autowired
    private ProductsRepo productsRepo;

   public List<Product> getAllProducts()
   {
       return productsRepo.findAll();
   }
    public Product getProduct(int id)
    {
        Optional<Product> product = productsRepo.findById(id);
        return product.orElseThrow(()->new RuntimeException("there is no product with this ID = "+id));
    }



}
