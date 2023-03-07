package src.homework3.cars;

import src.homework3.cars.avtosalon.Avtosalon;
import src.homework3.cars.factory.Factory;
import src.homework3.cars.model.Car;
import src.homework3.cars.model.enums.Color;
import src.homework3.cars.model.enums.Engine;
import src.homework3.cars.model.enums.Model;
import src.homework3.cars.model.enums.WheelSize;
import src.homework3.cars.service.Service;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(
                Model.values(),
                Color.values(),
                Engine.values(),
                WheelSize.values()
        );
        Service service = new Service();
        Avtosalon avtosalon = new Avtosalon(factory, service);
        avtosalon.printFactorySettings();

        Car car = avtosalon.getCarFromFactory(
                Model.E300,
                Color.BLUE,
                Engine.CDI_3000,
                WheelSize.R17,
                new HashSet<>()
        );
    }
}
