package project.shops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.shops.dto.CartDTO;
import project.shops.dto.UpdateCartDTO;
import project.shops.model.Cart;
import project.shops.service.CartService;
import project.shops.service.GoodsService;
import project.shops.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/cart")
public class CartController {
    @Autowired
    private CartService cartService;
    @Autowired
    private UserService userService;
    @Autowired
    private GoodsService goodsService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<CartDTO>> getListGoods(@PathVariable Long id) {
        List<Cart> cartsList = cartService.findAllByUser_IdUserAndStatusCartTrue(id);
        List<CartDTO> cartDTOList=new ArrayList<>();
        CartDTO cartDTO;
        if (cartsList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        for (Cart cart : cartsList) {
            cartDTO = new CartDTO();
            cartDTO.setIdCart(cart.getIdCart());
            cartDTO.setQuantity(cart.getQuantity());
            cartDTO.setIdUser(cart.getUser().getIdUser());
            cartDTO.setIdGoods(cart.getGood().getIdGoods());
            cartDTO.setGoodsName(cart.getGood().getGoodsName());
            cartDTO.setPrice(cart.getGood().getPrice());
            cartDTO.setQuantityGood(cart.getGood().getQuantity());
            cartDTO.setTradeMark(cart.getGood().getTradeMark());
            cartDTO.setSaleOff(cart.getGood().getSaleOff());
            cartDTO.setPriceForSaleOff(cart.getGood().getPriceForSaleOff());
            cartDTO.setImage(cart.getGood().getImage());
            cartDTO.setStatusGood(cart.getGood().getStatusGood());
            cartDTO.setCategorySex(cart.getGood().getCategorySex());
            cartDTOList.add(cartDTO);
        }
        return new ResponseEntity<>(cartDTOList, HttpStatus.OK);
    }

    public boolean duplication(Long idGoods, Long idUser) {
        List<Cart> cartsList = cartService.findAllByUser_IdUserAndStatusCartTrue(idUser);
        if (!cartsList.isEmpty()) {
            for (Cart value : cartsList) {
                if (idGoods.equals(value.getGood().getIdGoods())) {
                    return true;
                }
            }
        }
        return false;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Cart> createCart(@RequestBody CartDTO cartDTO) {
        Cart cart;
        if (this.duplication(cartDTO.getIdGoods(), cartDTO.getIdUser())) {
            cart = cartService.findCartByGood_IdGoodsAndStatusCartTrue(cartDTO.getIdGoods());
            cart.setQuantity(cart.getQuantity() + 1);
            System.err.println("bij trung");
        } else {
            cart = new Cart();
            cart.setQuantity(cartDTO.getQuantity());
            cart.setGood(goodsService.findById(cartDTO.getIdGoods()));
            cart.setUser(userService.findById(cartDTO.getIdUser()));
            System.err.println("taoj moiws");
        }
        cart.setStatusCart(true);
        cartService.create(cart);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/updateCart")
    public ResponseEntity<?> updateCart(@RequestBody UpdateCartDTO updateCartDTO) {
        List<CartDTO> listCart = updateCartDTO.getList();
        System.out.println(listCart.toString());
        Cart cart;
        System.err.println(listCart.toString());
        for (CartDTO el : listCart) {
            cart = cartService.findById(el.getIdCart());
            cart.setQuantity(el.getQuantity());
            cartService.create(cart);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
