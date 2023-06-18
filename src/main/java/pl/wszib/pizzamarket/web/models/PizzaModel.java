package pl.wszib.pizzamarket.web.models;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PizzaModel {
    private Long id;
    private String name;
    private BigDecimal price;
    private String ingredients;

    /*konstrultpor*/

    public PizzaModel(Long id, String name, BigDecimal price, String ingredients) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    /*getery*/
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getIngredients() {
        return ingredients;
    }
}
