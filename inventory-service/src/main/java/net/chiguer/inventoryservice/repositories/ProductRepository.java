package net.chiguer.inventoryservice.repositories;

import jakarta.persistence.Id;
import net.chiguer.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {

}
