package src.homework2;
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
public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car(CarsColors.AUDI);
        Car car2 = new Car(CarsColors.BMW);
        Car car3 = new Car(CarsColors.KIA);

        System.out.println(car1.getBrand());
        System.out.println(car1.getColor());

        System.out.println(car2.getBrand());
        System.out.println(car2.getColor());

        System.out.println(car3.getBrand());
        System.out.println(car3.getColor());

        car1.getChangeCoolor("BLACK");

        }
    }
