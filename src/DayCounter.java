package src;

import java.time.LocalDate;

public class DayCounter {
    public static void main(String[] args) {
//        Задать три числа – день, месяц, год.
//        Вывести на экран в виде трех чисел дату следующего дня.

        int day = 28;
        int month = 2;
        int year = 401;
        String tomorrowDate = ""; // <-- както узнать
        int daysCountInCurrentMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysCountInCurrentMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysCountInCurrentMonth = 30;
                break;
            case 2:
                if (year % 4 == 0 || year % 400 == 0) {
                    daysCountInCurrentMonth = 29;
                    break;
                }
                daysCountInCurrentMonth = 28;
                break;
        }

        int newDay = 0;
        int newMonth = 0;
        int newYear = 0;

        if (day + 1 > daysCountInCurrentMonth) {
            newDay = 1;
            if (month + 1 > 12) {
                newMonth = 1;
                newYear = year + 1;
            } else {
                newMonth = month + 1;
                newYear = year;
            }
        } else {
            newDay = day + 2;
            newMonth = month;
            newYear = year;
        }
        tomorrowDate = newDay + "/" + newMonth + "/" + newYear;
        System.out.println(tomorrowDate);

        System.out.println(LocalDate.of(year, month, day).plusDays(1));
    }

}
