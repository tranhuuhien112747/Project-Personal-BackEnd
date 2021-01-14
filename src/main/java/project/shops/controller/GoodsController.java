package project.shops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.shops.model.Goods;
import project.shops.model.User;
import project.shops.service.GoodsService;
import project.shops.service.UserService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    UserService userService;

    /**
     * show all goods
     *
     * @return list <Goods>
     */

    @GetMapping(value = "/list-good")
    public ResponseEntity<List<Goods>> getListGoods() {
        List<Goods> goodsList = goodsService.findAllGood();
        if (goodsList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(goodsList, HttpStatus.OK);
    }

    @GetMapping("/find-by")
    public ResponseEntity<User> findByUser(@RequestParam("username") String username) {
        User user = userService.findByUsername(username);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
