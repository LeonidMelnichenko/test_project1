package src.homework3.cars.factory;

import src.homework3.cars.model.Car;
import src.homework3.cars.model.enums.Color;
import src.homework3.cars.model.enums.Engine;
import src.homework3.cars.model.enums.Model;
import src.homework3.cars.model.enums.WheelSize;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private final List<Car> cars = new ArrayList<>();

    public void addCarsToStock(Car car) {
        cars.add(car);
    }

    public Car getChooseRightCarFromStock(Model model,
                                          Color color,
                                          Engine engine,
                                          WheelSize wheelSize) {
        Car car = null;
        int index = 0;
        for (int i = 0; i < cars.size(); i++) {
            Car temp = cars.get(i);
            if (temp.getModel() == model && temp.getEngine() == engine) {
                if (car == null) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getColor() == color && car.getColor() != color) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getWheelSize() == wheelSize && car.getWheelSize() != wheelSize) {
                    car = temp;
                    index = i;
                }
            }
            if (car != null) {
                cars.remove(index);
            }
        }
        return car;
    }
}



