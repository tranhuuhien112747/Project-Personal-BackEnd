package project.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.shops.model.Goods;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods, Long> {
    List<Goods> findAllByTradeMarkAndCategorySex(String tradeMark, String sex);

    List<Goods> findAllByTradeMark(String tradeMark);

    List<Goods> findAllByCategorySex(String sex);
}
