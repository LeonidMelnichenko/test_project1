package src.homework2.phone;

import src.homework2.task4.Color2;

public enum Name {
    IVAN (1234567),
    DIMA(2345678),
    LENA(3456789),
    ;
    private int number;
    Name(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }




}



