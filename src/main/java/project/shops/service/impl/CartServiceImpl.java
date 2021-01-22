package project.shops.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.shops.model.Cart;
import project.shops.repository.CartRepository;
import project.shops.service.CartService;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<Cart> findAllByUser_IdUserAndStatusCartTrue(Long id) {
        return cartRepository.findAllByUser_IdUserAndStatusCartTrue(id);
    }

    @Override
    public void create(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void deleteById(Long id) {
        cartRepository.deleteById(id);
    }

    @Override
    public Cart findById(Long id) {
        return cartRepository.findById(id).orElse(null);
    }

    @Override
    public Cart findCartByGood_IdGoodsAndStatusCartTrue(Long id) {
        return cartRepository.findCartByGood_IdGoodsAndStatusCartTrue(id);
    }
}
