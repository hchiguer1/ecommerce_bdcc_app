package net.chiguer.orderservices.repositories;

import net.chiguer.orderservices.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
}
