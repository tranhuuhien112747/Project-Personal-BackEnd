package project.shops.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class BillGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBillGoods;

    @OneToMany(mappedBy = "billGoods", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("billGoods")
    private Collection<Bill> billCollection;

    @OneToMany(mappedBy = "billGoods", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("billGoods")
    private Collection<Goods> goodsCollection;

    public Long getIdBillGoods() {
        return idBillGoods;
    }

    public void setIdBillGoods(Long idBillGoods) {
        this.idBillGoods = idBillGoods;
    }

    public Collection<Bill> getBillCollection() {
        return billCollection;
    }

    public void setBillCollection(Collection<Bill> billCollection) {
        this.billCollection = billCollection;
    }

    public Collection<Goods> getGoodsCollection() {
        return goodsCollection;
    }

    public void setGoodsCollection(Collection<Goods> goodsCollection) {
        this.goodsCollection = goodsCollection;
    }
}
