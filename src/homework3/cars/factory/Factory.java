package src.homework3.cars.factory;

import src.homework3.cars.model.Car;
import src.homework3.cars.model.enums.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class Factory {

    private static final int YEAR = 2022;
    private final Model[] models;
    private  final Color[] colors;
    private final Engine[] engines;
    private final WheelSize[] wheelSizes;
    private final Stock stock;

    public Factory(Model[] models,
                    Color[] colors,
                    Engine[] engines,
                    WheelSize[] wheelSizes
                   ) {
        this.models = models;
        this.colors = colors;
        this.engines = engines;
        this.wheelSizes = wheelSizes;
        this.stock = new Stock();
        fillStockWithcars();
    }
    public Car createCar(Model model,
                         Color color,
                         Engine engine,
                         WheelSize wheelSize,
                         Set<Options> options) {
        Car car = stock.getChooseRightCarFromStock(model, color, engine, wheelSize);
            if (car != null) {
                if (car.getColor() != color) {
                    car.setColor(color);
                }
                if (car.getWheelSize() != wheelSize) {
                    car.setWheelSize(wheelSize);
                }
                car.setOptions(options);
                return car;
            }
            return new Car(YEAR, model, color, engine, wheelSize, options);
        }
    public String getConfigurations(){
        return format(
                "Factory can produce: colors: %s, models: %s, wheelsizes: %s, engines: %s, " ,
                Arrays.toString(models),
                Arrays.toString(colors),
                Arrays.toString(engines),
                Arrays.toString(wheelSizes)
            );
        }
        private void fillStockWithcars(){
            Car car = new Car(
                    YEAR,
                    Model.E200,
                    Color.RED,
                    Engine.CDI_2000,
                    WheelSize.R15,
                    new HashSet<>()
            );
           this.stock.addCarsToStock(car);
           Set<Options> options = new HashSet<>();
           options.add(Options.AIR_CONDITIONER);
           options.add(Options.HEATED_SEATS);
           options.add(Options.PARKING_SENSORS);

           Car car1 = new Car(
                   YEAR,
                   Model.E300,
                   Color.BLUE,
                   Engine.CDI_3000,
                   WheelSize.R16,
                   new HashSet<>()
           );
           this.stock.addCarsToStock(car1);
           Set<Options> options1 = new HashSet<>();
           options1.add(Options.PARKING_SENSORS);
           options1.add(Options.CLIMATE_CONTROL);
           options1.add(Options.HEATED_SEATS);
        }
    }

