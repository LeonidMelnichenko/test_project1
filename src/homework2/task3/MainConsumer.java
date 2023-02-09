package src.homework2.task3;

public class MainConsumer {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.consume(3);
        consumer.consume(1);
        consumer.consume(1);
        consumer.consume(7);
        consumer.consume(1);
        consumer.consume(8);
        double avg = consumer.avg();
       }
    }




