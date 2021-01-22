package project.shops.dto;


public class CartDTO {
    private long idCart;
    private int quantity;
    private Long idUser;
    private Long idGoods;
    private String goodsName;
    private String price;
    private String quantityGood;
    private String tradeMark;
    private String saleOff;
    private String priceForSaleOff;
    private String image;
    private Boolean statusGood;
    private String categorySex;

    public CartDTO(long idCart, int quantity, Long idUser, Long idGoods) {
        this.idCart = idCart;
        this.quantity = quantity;
        this.idUser = idUser;
        this.idGoods = idGoods;
    }

    public CartDTO() {
    }

    public long getIdCart() {
        return idCart;
    }

    public void setIdCart(long idCart) {
        this.idCart = idCart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
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

    public String getQuantityGood() {
        return quantityGood;
    }

    public void setQuantityGood(String quantityGood) {
        this.quantityGood = quantityGood;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    @Override
    public String toString() {
        return "CartDTO{" +
                "idCart=" + idCart +
                ", quantity=" + quantity +
                ", idUser=" + idUser +
                ", idGoods=" + idGoods +
                '}';
    }
}
