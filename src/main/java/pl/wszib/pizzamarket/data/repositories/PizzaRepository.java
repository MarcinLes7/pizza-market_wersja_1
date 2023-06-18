package pl.wszib.pizzamarket.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wszib.pizzamarket.data.entities.PizzaEntity;

public interface PizzaRepository extends JpaRepository<PizzaEntity, Long> { /*to repozytorium zapewni nam implementacje operacji na tej tabeli pizzas*/


}
