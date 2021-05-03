package dao;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAOImpl implements CarDAO {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("q", 1, 1));
        cars.add(new Car("w", 2, 2));
        cars.add(new Car("e", 3, 3));
        cars.add(new Car("r", 4, 4));
        cars.add(new Car("t", 5, 5));
    }

    @Override
    public List<Car> getCars(int number) {
        switch (number) {
            case 2:
                return cars.subList(0, 2);
            case 3:
                return cars.subList(0, 3);
            case 4:
                return cars.subList(0, 5);
            default:
                return cars;
        }
    }
}
