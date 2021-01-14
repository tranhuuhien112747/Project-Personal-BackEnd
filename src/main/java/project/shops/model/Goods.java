package project.shops.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGoods;
    private String goodsName;
    private String price;
    private String quantity;
    private String tradeMark;
    private String saleOff;
    private String priceForSaleOff;
    private String image;
    private Boolean statusGood;
    private String categorySex;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    @JsonIgnoreProperties("goodsCollection")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "idBillGoods")
    @JsonIgnoreProperties("goodsCollection")
    private BillGoods billGoods;

    @ManyToOne
    @JoinColumn(name = "idCart")
    @JsonIgnoreProperties("goodsCollection")
    private Cart cart;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getIdGoods() {
        return idGoods;
    }

    public void setIdGoods(Long idGoods) {
        this.idGoods = idGoods;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public String getSaleOff() {
        return saleOff;
    }

    public void setSaleOff(String saleOff) {
        this.saleOff = saleOff;
    }

    public String getPriceForSaleOff() {
        return priceForSaleOff;
    }

    public void setPriceForSaleOff(String priceForSaleOff) {
        this.priceForSaleOff = priceForSaleOff;
    }

    public Boolean getStatusGood() {
        return statusGood;
    }

    public void setStatusGood(Boolean statusGood) {
        this.statusGood = statusGood;
    }

    public String getCategorySex() {
        return categorySex;
    }

    public void setCategorySex(String categorySex) {
        this.categorySex = categorySex;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BillGoods getBillGoods() {
        return billGoods;
    }

    public void setBillGoods(BillGoods billGoods) {
        this.billGoods = billGoods;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
