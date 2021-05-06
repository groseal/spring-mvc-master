package groseal.dao;

import groseal.model.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> getCars (Integer number);
}
