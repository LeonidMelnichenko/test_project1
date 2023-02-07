package src.homework2;

public class Car2 {
    private Brand2 brand;
    private Color2 color;

    public Car2(Brand2 brand, Color2 color){
        this.brand = brand;
        for(Color2 c : brand.getColors()){
            if(c == color){
                this.color = color;
                break;
            }
        }
    }
    public String setColor (String newColor){
        for (Color2 col : brand.getColors()) {
            if(col.name().equals(newColor.toUpperCase())){
                color = col;
                System.out.println("Цвет изменен на: " + newColor);
            }
        }
        return "   ";
    }
    public Brand2 getBrand(){
        return brand;
    }
    public Color2 getColor(){
        return color;
    }
}
