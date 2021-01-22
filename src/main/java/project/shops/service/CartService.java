package project.shops.service;

import org.springframework.stereotype.Service;
import project.shops.model.Cart;

import java.util.List;

public interface CartService {
    List<Cart> findAllByUser_IdUserAndStatusCartTrue(Long id);

    void create(Cart cart);

    void deleteById(Long id);

    Cart findById(Long id);

    Cart findCartByGood_IdGoodsAndStatusCartTrue(Long id);
}
