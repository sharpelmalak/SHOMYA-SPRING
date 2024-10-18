package iti.jets.shomya.persistence.repositery;

import iti.jets.shomya.persistence.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductsRepo extends JpaRepository<Product,Integer> {
    Optional<Product> findById(Integer id);
}
