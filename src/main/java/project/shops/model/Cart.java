package project.shops.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCart;
    private int quantity;
    private Boolean statusCart;

    @ManyToOne
    @JoinColumn(name = "idUser")
    @JsonIgnoreProperties("cartCollection")
    private User user;


    @ManyToOne
    @JoinColumn(name = "idGoods")
    @JsonIgnoreProperties("cartCollection")
    private Goods good;


    public Long getIdCart() {
        return idCart;
    }

    public void setIdCart(Long idCart) {
        this.idCart = idCart;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Goods getGood() {
        return good;
    }

    public void setGood(Goods good) {
        this.good = good;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Boolean getStatusCart() {
        return statusCart;
    }

    public void setStatusCart(Boolean statusCart) {
        this.statusCart = statusCart;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "idCart=" + idCart +
                ", quantity=" + quantity +
                ", user=" + user +
                ", good=" + good +
                '}';
    }
}
