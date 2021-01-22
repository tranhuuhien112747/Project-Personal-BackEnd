package project.shops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import project.shops.dto.GetUserDTO;
import project.shops.dto.GoodDTO;
import project.shops.model.Goods;
import project.shops.model.User;
import project.shops.service.GoodsService;
import project.shops.service.UserService;

import java.util.ArrayList;
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
    public ResponseEntity<List<GoodDTO>> getListGoods() {
        List<Goods> goodsList = goodsService.findAllGood();
        List<GoodDTO> goodDTOList = new ArrayList<>();
        GoodDTO goodDTO;
        if (goodsList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        for (Goods good : goodsList) {
            goodDTO = new GoodDTO();
            goodDTO.setIdGoods(good.getIdGoods());
            goodDTO.setGoodsName(good.getGoodsName());
            goodDTO.setPrice(good.getPrice());
            goodDTO.setQuantityGood(good.getQuantity());
            goodDTO.setTradeMark(good.getTradeMark());
            goodDTO.setPriceForSaleOff(good.getPriceForSaleOff());
            goodDTO.setImage(good.getImage());
            goodDTO.setSaleOff(good.getSaleOff());
            goodDTO.setCategorySex(good.getCategorySex());
            goodDTO.setIdCategory(good.getCategory().getIdCategory());
            goodDTOList.add(goodDTO);
        }
        return new ResponseEntity<>(goodDTOList, HttpStatus.OK);
    }

    @GetMapping("/find-by")
    public ResponseEntity<GetUserDTO> findByUser(@RequestParam("username") String username) {
        User user = userService.findByUsername(username);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        GetUserDTO getUserDTO=new GetUserDTO();
        getUserDTO.setIdUser(user.getIdUser());
        getUserDTO.setUsername(user.getUsername());
        getUserDTO.setPassword(user.getPassword());
        getUserDTO.setFullName(user.getFullName());
        getUserDTO.setEmail(user.getEmail());
        getUserDTO.setAddress(user.getAddress());
        getUserDTO.setPhoneNumber(user.getPhoneNumber());
        getUserDTO.setEmail(user.getEmail());
        getUserDTO.setStatus(user.getStatus());
        return new ResponseEntity<>(getUserDTO, HttpStatus.OK);
    }

}
