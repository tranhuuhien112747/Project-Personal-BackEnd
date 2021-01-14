package project.shops.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBill;
    private String createdDate;
    private Boolean billType;
    private String quantity;

    @ManyToOne
    @JoinColumn(name = "idUser")
    @JsonIgnoreProperties("billCollection")
    private User user;

    @ManyToOne
    @JoinColumn(name = "idBillGoods")
    @JsonIgnoreProperties("billCollection")
    private BillGoods billGoods;

    public Long getIdBill() {
        return idBill;
    }

    public void setIdBill(Long idBill) {
        this.idBill = idBill;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getBillType() {
        return billType;
    }

    public void setBillType(Boolean billType) {
        this.billType = billType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BillGoods getBillGoods() {
        return billGoods;
    }

    public void setBillGoods(BillGoods billGoods) {
        this.billGoods = billGoods;
    }
}
