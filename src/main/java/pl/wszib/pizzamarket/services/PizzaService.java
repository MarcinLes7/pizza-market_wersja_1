package pl.wszib.pizzamarket.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pl.wszib.pizzamarket.data.entities.PizzaEntity;
import pl.wszib.pizzamarket.data.repositories.PizzaRepository;
import pl.wszib.pizzamarket.web.mappers.PizzaMapper;
import pl.wszib.pizzamarket.web.models.PizzaModel;

import java.util.List;

@Service /*robimy to po to żeby kontrolery nie zawierały całj logiki biznesowej*/
/*tu chcemy wyświetlac menu i odwłolac sie do repozytorium*/
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    /*konstruktor*/
    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<PizzaModel> findAll() {
        List<PizzaEntity> entities = pizzaRepository.findAll();
        /*wkładamy streamy*/
        return entities.stream()
                .map(PizzaMapper::toModel)
                .toList();
    }

    public PizzaModel getById(Long pizzaId) {
        PizzaEntity pizzaEntity = pizzaRepository.findById(pizzaId).orElseThrow(EntityNotFoundException::new);

        return PizzaMapper.toModel(pizzaEntity);
    }

}
