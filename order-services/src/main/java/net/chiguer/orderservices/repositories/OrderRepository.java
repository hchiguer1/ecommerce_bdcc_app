package net.chiguer.orderservices.repositories;

import net.chiguer.orderservices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,String> {

}
