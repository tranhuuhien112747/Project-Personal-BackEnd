package project.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.shops.model.Cart;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findAllByUser_IdUserAndStatusCartTrue(Long id);

    Cart findCartByGood_IdGoodsAndStatusCartTrue(Long id);
}
