package project.shops.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.shops.model.Goods;
import project.shops.repository.GoodsRepository;
import project.shops.service.GoodsService;

import java.util.List;


@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsRepository goodsRepository;

    @Override
    public List<Goods> findAllGood() {
        return goodsRepository.findAll();
    }

    @Override
    public List<Goods> findAllByTradeMarkAndCategorySex(String tradeMark, String sex) {
        return goodsRepository.findAllByTradeMarkAndCategorySex(tradeMark, sex);
    }

    @Override
    public List<Goods> findAllByTradeMark(String tradeMark) {
        return goodsRepository.findAllByTradeMark(tradeMark);
    }

    @Override
    public List<Goods> findAllByCategorySex(String sex) {
        return goodsRepository.findAllByCategorySex(sex);
    }

    @Override
    public void create(Goods goods) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Goods findById(Long id) {
        return goodsRepository.findById(id).orElse(null);
    }
}
