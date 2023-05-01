package src.homework2.phone;
//Создайте класс Phone, который содержит поля
//        number
//        model
//        weight
//
//        Создайте три экземпляра (instance) этого класса.
//        Выведите в консоль их значения.
//
//        Добавить в класс Phone методы:
//        receiveCall (один параметр – имя звонящего). Выводит на консоль сообщение “Звонит {name}”.
//        getNumber – возвращает номер телефона.
//        receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
//
//        Создать метод sendMessage с аргументами переменной длины.
//        Данный метод принимает на вход номера телефонов, которым будет
//        отправлено сообщение. Метод выводит на консоль номера этих телефонов.
public class Phone {
    int number;
    String name;

    public Phone(int number, String name) {
        this.number = number;
        this.name = name;
    }

//    public String receiveCall (String name){
//
//    }
//    public void sendMessege(int number){
//
//        System.out.println(getNumber());
//    }
}
