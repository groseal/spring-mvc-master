package groseal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import groseal.service.CarService;

@Controller
public class ControllerCars {

    private final CarService carService;

    public ControllerCars(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer number, Model model) {
        model.addAttribute("cars", carService.getCars(number));
        return "cars";
    }
}
