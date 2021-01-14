package project.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.shops.model.BillGoods;

public interface BillGoodsRepository extends JpaRepository<BillGoods, Long> {
}
