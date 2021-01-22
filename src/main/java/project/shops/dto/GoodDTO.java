package project.shops.dto;

public class GoodDTO {
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
    private Long idCategory;

    public GoodDTO() {
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

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }
}
