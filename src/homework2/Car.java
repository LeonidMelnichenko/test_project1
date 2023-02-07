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
}

        //for(CarsColors c : CarsColors.availiableColors)

        //this.color = null;

    /*public Car2(Brand2 brand, Color2 color){
        this.brand = brand;
        for(Color2 c : brand.getColors()){
            if(c == color){
                this.color = color;
                break;


        public void setColor (String newColor){
        for (Color2 col : brand.getColors()) {
            if(col.name().equals(newColor.toUpperCase())){
                color = col;
            }
        }
    }
     */