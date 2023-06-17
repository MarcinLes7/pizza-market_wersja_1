package pl.wszib.pizzamarket.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // żeby to był kontroller to musimy oznaczyć te klasa jako kontroller
public class HomeController { // ta klasa to jest kontroller do strony głównej
    @GetMapping("/") // żeby wyświetlić tę stronę więc potrzebna ścieżka - to strona główna więc musi być slash "/"
    public String homePage(Model model) { // musimy stworzyć metodę jak to ma być robione, zawsze to musi być String oraz nazwa metody. Trzeba dodać parametr i wtedy zawsze trzeba dodac Model model
        model.addAttribute("firstName", "Janek"); // i gdy mamy ten parametr tomożemy dodać cos do tej metody
        return "homePage";   // metoda zawsze zwraca nazwe tego templejtu
    }

}
