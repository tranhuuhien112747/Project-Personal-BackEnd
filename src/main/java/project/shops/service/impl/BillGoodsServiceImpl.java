package project.shops.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.shops.model.BillGoods;
import project.shops.model.Goods;
import project.shops.repository.BillGoodsRepository;
import project.shops.service.BillGoodsService;

@Service
public class BillGoodsServiceImpl implements BillGoodsService {
    @Autowired
    private BillGoodsRepository billGoodsRepository;

    @Override
    public void create(BillGoods billGoods) {
        billGoodsRepository.save(billGoods);
    }

    @Override
    public void deleteById(Long id) {
        billGoodsRepository.deleteById(id);
    }
}
