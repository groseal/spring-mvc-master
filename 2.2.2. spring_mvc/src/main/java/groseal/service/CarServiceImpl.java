package groseal.service;

import groseal.dao.CarDAO;
import groseal.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

   private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(Integer number) {
        return carDAO.getCars(number);
    }
}
