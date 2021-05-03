package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

@Controller
public class ControllerCars {
    CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer number, Model model) {
        if (number == null) {
            number = 0;
        }
        model.addAttribute("cars", carService.getCars(number));
        return "cars";
    }
}
