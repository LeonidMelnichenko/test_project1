package src.homework2.task3;

public class MainConsumer {
    public static void main(String[] args) {
        Consumer consumer = new Consumer(5);
        consumer.consume(1);
        consumer.consume(1);
        consumer.consume(1);
        consumer.consume(1);
        consumer.consume(1);
        consumer.consume(1);
        consumer.consume(1);
        consumer.consume(1);
        consumer.consume(1);
        double avg = consumer.avg();
       }
    }




