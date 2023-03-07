package src.homework3.cars.service;

import src.homework3.cars.model.enums.Color;
import src.homework3.cars.model.enums.Options;
import src.homework3.cars.model.enums.WheelSize;
import src.homework3.cars.model.Car;

import java.util.Set;

public class Service {

    public void changeColor(Car car, Color color){
        if(car != null && color != null && !color.equals((car.getColor()))){
            car.setColor(color);
        }
    }
    public void changeWheelSize(Car car, WheelSize wheelSize){
        if(car != null && wheelSize != null && !wheelSize.equals(car.getWheelSize())){
            car.setWheelSize(wheelSize);
        }
    }

    public void removeOption(Car car, Options options){
        if(car != null && options != null){
            car.getOptions().remove(options);
        }
    }

    public void addOption (Car car, Options options){
        if(car != null && options != null){
            car.getOptions().add(options);
        }
    }

    public void setOptions (Car car, Set<Options> options){
        if(car != null && options != null){
            car.setOptions(options);
        }
    }
}
