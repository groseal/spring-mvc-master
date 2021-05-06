package groseal.dao;

import groseal.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("q", 1, 1));
        cars.add(new Car("w", 2, 2));
        cars.add(new Car("e", 3, 3));
        cars.add(new Car("r", 4, 4));
        cars.add(new Car("t", 5, 5));
    }

    @Override
    public List<Car> getCars(Integer number) {
        if (number == null || number >= 5) {
            return cars;
        } else {
            return cars.stream().limit(number).collect(Collectors.toList());
        }
    }
}
