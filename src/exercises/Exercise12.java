package src.exercises;

public class Exercise12 {
    public static void main(String[] args) {
        raspisanie(4);
    }
    public static void raspisanie(int day){

      switch (day){
          case 1:
              System.out.println("Понедельник - намылить Жорику шею");
              break;
          case 2:
              System.out.println("Вторник - купить сало");
              break;
          case 3:
              System.out.println("Среда - сделать с Жориком уроки");
              break;
          case 4:
              System.out.println("Четверг - забрать у Жорика телефон");
              break;
          case 5:
              System.out.println("Пятница - надрать Жорику уши");
              break;
          case 6:
              System.out.println("Суббота - отдать Жорику телефон");
              break;
          case 7:
              System.out.println("Воскресенье - снова забрать у Жорика телефон");
              break;
        }
    }
}
