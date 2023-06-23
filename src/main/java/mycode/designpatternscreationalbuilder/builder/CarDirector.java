package mycode.designpatternscreationalbuilder.builder;

import mycode.designpatternscreationalbuilder.entities.Car;

public class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public void buildCar() {
        builder.setModel();
        builder.setColor();
        builder.setCarAdditionalInfo();
    }

    public Car getCar() {
        return builder.getResultCar();
    }
}
