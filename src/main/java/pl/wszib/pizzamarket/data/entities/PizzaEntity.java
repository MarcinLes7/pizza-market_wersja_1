package pl.wszib.pizzamarket.data.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "pizzas") /*nazwa tabeli w bazie danych*/
public class PizzaEntity { /*tu tworzymy tabele z pizzami*/
    @Id /*id w tabeli*/
    @GeneratedValue /*generowanie wartości w tabeli*/
    @Column(name = "id") /*chcemy, sami nazywać te kolumnę a nie żeby była automatycznie */
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "ingredients")
    private String ingredients;

    /*generujemy getery i setery*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
