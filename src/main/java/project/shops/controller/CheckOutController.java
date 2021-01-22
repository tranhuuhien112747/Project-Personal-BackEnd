package project.shops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.shops.model.Bill;
import project.shops.model.BillGoods;
import project.shops.model.Cart;
import project.shops.model.Goods;
import project.shops.service.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/check-out")
public class CheckOutController {
    @Autowired
    private CartService cartService;
    @Autowired
    private UserService userService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private BillService billService;
    @Autowired
    private BillGoodsService billGoodsService;

    @PostMapping(value = "/{idUser}")
    public ResponseEntity<Void> createBill(@PathVariable Long idUser) {
        List<Cart> cartsList = cartService.findAllByUser_IdUserAndStatusCartTrue(idUser);
        System.err.println(idUser);
        Bill bill = new Bill();
        BillGoods billGoods;
        Goods goods;
        bill.setBillType(false);
        bill.setUser(userService.findById(idUser));
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        bill.setCreatedDate(formatter.format(date));
        billService.create(bill);
        System.err.println(cartsList.toString());
        for (Cart cart : cartsList) {
            cart.setStatusCart(false);
            cartService.create(cart);
            goods = goodsService.findById(cart.getGood().getIdGoods());
            goods.setQuantity(String.valueOf(Integer.parseInt(goods.getQuantity()) - cart.getQuantity()));
            goodsService.create(goods);
            billGoods = new BillGoods();
            billGoods.setBill(bill);
            billGoods.setQuantityBooked(cart.getQuantity());
            billGoods.setGood(goods);
            billGoodsService.create(billGoods);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
