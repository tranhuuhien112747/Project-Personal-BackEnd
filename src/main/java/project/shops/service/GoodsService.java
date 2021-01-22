package project.shops.service;

import project.shops.model.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> findAllGood();

    List<Goods> findAllByTradeMarkAndCategorySex(String tradeMark, String sex);

    List<Goods> findAllByTradeMark(String tradeMark);

    List<Goods> findAllByCategorySex(String sex);

    void create(Goods goods);

    void deleteById(Long id);

    Goods findById(Long id);
}
