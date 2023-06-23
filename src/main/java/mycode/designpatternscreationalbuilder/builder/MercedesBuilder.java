package mycode.designpatternscreationalbuilder.builder;

import mycode.designpatternscreationalbuilder.entities.Car;

public class MercedesBuilder implements CarBuilder {

    private Car car;

    public MercedesBuilder() {
        this.car = new Car();
    }

    @Override
    public void setModel() {
        car.setModelName("Mercedes");
        car.setModelYear("2021");
    }

    @Override
    public void setColor() {
        car.setColor("black");
    }

    @Override
    public void setCarAdditionalInfo() {
        car.setHorsePower(160);
        car.setTankCapacity(90);
    }

    @Override
    public void clear() {
        car = new Car();
    }

    @Override
    public Car getResultCar() {
        return car;
    }
}
