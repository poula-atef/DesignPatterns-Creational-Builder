package mycode.designpatternscreationalbuilder.builder;


import mycode.designpatternscreationalbuilder.entities.Car;

public interface CarBuilder {
    void setModel();
    void setColor();
    void setCarAdditionalInfo();
    void clear();
    Car getResultCar();
}
