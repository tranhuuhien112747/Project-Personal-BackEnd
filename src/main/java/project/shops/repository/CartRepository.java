package project.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.shops.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
