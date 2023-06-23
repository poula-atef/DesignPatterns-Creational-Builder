package mycode.designpatternscreationalbuilder;

import mycode.designpatternscreationalbuilder.builder.CarDirector;
import mycode.designpatternscreationalbuilder.builder.KiaBuilder;
import mycode.designpatternscreationalbuilder.entities.Car;

public class BuilderDesignPattern {
    public static void main(String[] args) {

        KiaBuilder builder = new KiaBuilder();
        CarDirector director = new CarDirector(builder);
        director.buildCar();
        Car car = director.getCar();
        // Car Model Name Is Kia
        System.out.println("Car Type: " + car.getModelName());
    }
}
