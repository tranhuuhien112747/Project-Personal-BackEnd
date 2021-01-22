package project.shops.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class BillGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBillGoods;
    private int quantityBooked;

    @ManyToOne
    @JoinColumn(name = "idBill")
    @JsonIgnoreProperties("billGoodsCollection")
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "idGoods")
    @JsonIgnoreProperties("billGoodsCollection")
    private Goods good;

    public Long getIdBillGoods() {
        return idBillGoods;
    }

    public void setIdBillGoods(Long idBillGoods) {
        this.idBillGoods = idBillGoods;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Goods getGood() {
        return good;
    }

    public void setGood(Goods good) {
        this.good = good;
    }

    public int getQuantityBooked() {
        return quantityBooked;
    }

    public void setQuantityBooked(int quantityBooked) {
        this.quantityBooked = quantityBooked;
    }
}
