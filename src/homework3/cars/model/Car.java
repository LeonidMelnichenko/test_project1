package src.homework3.cars.model;

import src.homework3.cars.model.enums.*;

import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class Car {

    private static final String TO_STRING_TEMPLATE = "Car {year: %s, model: %s, color: %s, engine: %s, " +
            "wheelsize: %s, optoins: %s}";
    private final int year;
    private final Model model;
    private Color color;
    private final Engine engine;
    private WheelSize wheelSize;
    private Set<Options> options;

    public Car(int year,
               Model model,
               Color color,
               Engine engine,
               WheelSize wheelSize,
               Set<Options> options) {
        this.year = year;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.wheelSize = wheelSize;
        this.options = options != null ? options :  new HashSet<>();
    }

    public int getYear() {
        return year;
    }

    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Set<Options> getOptions() {
        return options;
    }

    public void setOptions(Set<Options> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return format(
                TO_STRING_TEMPLATE,
                year,
                model,
                color,
                engine,
                wheelSize,
                options);
    }
}

