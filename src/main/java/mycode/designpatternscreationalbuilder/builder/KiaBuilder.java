package mycode.designpatternscreationalbuilder.builder;


import mycode.designpatternscreationalbuilder.entities.Car;

public class KiaBuilder implements CarBuilder {

    private Car car;

    public KiaBuilder() {
        this.car = new Car();
    }

    @Override
    public void setModel() {
        car.setModelName("Kia");
        car.setModelYear("2019");
    }

    @Override
    public void setColor() {
        car.setColor("red");
    }

    @Override
    public void setCarAdditionalInfo() {
        car.setHorsePower(200);
        car.setTankCapacity(50);
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
