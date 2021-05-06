package groseal.model;

public class Car {
    private String nameCar;
    private int modelCar;
    private int ageCar;

    public Car(String nameCar, int modelCar, int ageCar) {
        this.nameCar = nameCar;
        this.modelCar = modelCar;
        this.ageCar = ageCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public int getModelCar() {
        return modelCar;
    }

    public int getAgeCar() {
        return ageCar;
    }
}
