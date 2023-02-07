package src.homework2;

public class Car {

    private String brand;
    private String color;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Car(CarsColors carcolor) {
        this.brand = carcolor.name();
    }
    public void getChangeCoolor (String elemColor){
        String[] brandAveliableColor = new String[0];
        CarsColors.valueOf(brand);
        for(String s: brandAveliableColor){
            this.color = elemColor;
        }
    }
}
