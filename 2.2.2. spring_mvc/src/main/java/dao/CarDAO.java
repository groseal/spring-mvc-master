package dao;

import model.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> getCars (int number);
}
