package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class BasketMap {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Integer basket;
    private Integer tradable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBasket() {
        return basket;
    }

    public void setBasket(Integer basket) {
        this.basket = basket;
    }

    public Integer getTradable() {
        return tradable;
    }

    public void setTradable(Integer tradable) {
        this.tradable = tradable;
    }


}
