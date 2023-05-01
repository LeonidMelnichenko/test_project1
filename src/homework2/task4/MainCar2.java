package src.homework2.task4;

/*Задача 4:
        Необходимо реализовать класс Car,  который имеет поля марка и цвет.

        Марки имеют следующие цвета:
        Audi - Синий. Красный. Зеленый
        BMW - Оранжевый. Черный. Фиолетовый
        KIA -  Желтый. Cерый. Белый

        Ожидается метод который изметяет цвет.
        Как параметр принимает строку, если цвет не верный
        то ничего не изменяет.
 */
public class MainCar2 {
    public static void main(String[] args) {
        Car2 carAudi = new Car2(Brand2.AUDI, Color2.BLUE);
        Car2 carBMW = new Car2(Brand2.BMW, Color2.ORANGE);
        Car2 carKia = new Car2(Brand2.KIA, Color2.WHITE);

        System.out.println(carAudi.getBrand());
        System.out.println(carAudi.getColor());
        System.out.println(carAudi.setColor("GREEN"));

        System.out.println(carBMW.getBrand());
        System.out.println(carBMW.getColor());
        System.out.println(carBMW.setColor("ORANGE"));

        System.out.println(carKia.getBrand());
        System.out.println(carKia.getColor());
        System.out.println(carKia.setColor("YELLOW"));



    }
}
