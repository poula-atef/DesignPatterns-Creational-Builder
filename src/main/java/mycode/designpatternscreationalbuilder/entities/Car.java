package mycode.designpatternscreationalbuilder.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private String modelName;
    private String modelYear;
    private String color;
    private Integer horsePower;
    private Integer tankCapacity;
}
