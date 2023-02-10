package src.homework2.task3;

public class MainConsumer {
    public static void main(String[] args) {
        Consumer consumer = new Consumer(5);
        consumer.consume(1);
        consumer.consume(2);
        consumer.consume(3);
//        consumer.consume(4);
//        consumer.consume(5);
//        consumer.consume(6);
//        consumer.consume(7);
//        consumer.consume(8);
//        consumer.consume(9);
        double avg = consumer.avg();
       }
    }




