package pl.wszib.pizzamarket.web.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.wszib.pizzamarket.services.PizzaService;
import pl.wszib.pizzamarket.web.models.PizzaModel;

@Controller
public class OrderController {

    private final PizzaService pizzaService;

    public OrderController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }


    @GetMapping("order/{pizza-id}") /*ścieżka do zamówienia*/
    public String orderForm(@PathVariable("pizza-id") Long pizzaId, Model model) {
        PizzaModel pizza = pizzaService.getById(pizzaId);

       // model.addText("pizza");
       //  model.addAttribute("pizza", pizza);

         return "orderPage";


    }

}
