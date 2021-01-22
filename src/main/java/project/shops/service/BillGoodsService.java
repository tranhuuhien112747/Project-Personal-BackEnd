package project.shops.service;

import project.shops.model.BillGoods;

public interface BillGoodsService {
    void create(BillGoods billGoods);

    void deleteById(Long id);
}
