package src.homework3.cars.avtosalon;

import src.homework3.cars.factory.Factory;
import src.homework3.cars.model.Car;
import src.homework3.cars.model.enums.*;
import src.homework3.cars.service.Service;

import java.util.Set;

public class Avtosalon {
    private final Factory factory;
    private final Service service;

    public Avtosalon(Factory factory, Service service) {
        this.factory = factory;
        this.service = service;
    }
    public Car getCarFromFactory (Model model,
                                  Color color,
                                  Engine engine,
                                  WheelSize wheelSize,
                                  Set<Options> options){
        return factory.createCar(model, color, engine, wheelSize, options);
    }

    public void changeColor(Car car, Color color){
        service.changeColor(car, color);
    }
    public void changeWheelSize(Car car, WheelSize wheelSize){
        service.changeWheelSize(car, wheelSize);
    }
    public void addOption (Car car, Options options){
        service.addOption(car, options);
    }
    public void setOptions (Car car, Set<Options> options){
        service.setOptions(car, options);
    }
    public void removeOption(Car car, Options options){
        service.removeOption(car, options);
    }
    public void printFactorySettings(){
        System.out.println(factory.getConfigurations());
    }


}
