package src.homework2.task3;
    public class Consumer {
    private int lastNumber;
    public Consumer() {
        this.lastNumber = lastNumber;
    }
    private int counter = 0;
    private int iteraition = 0;
    int[] lastNumbersArray = new int[5];
    public void consume(int lastNumber) {
        lastNumbersArray[counter++] = lastNumber;
        iteraition++;
        if (counter == 5) {
            counter = 0;
        }
    }
    public double avg() {
         double sum = 0;
            for (int i = 0; i < 5; i++) {
                sum +=lastNumbersArray[i];
         }
            if(iteraition < 5){
                System.out.println(sum/iteraition);
         }
            if(iteraition > 5)
                System.out.println(sum/5);
            return 0;
        }
    }





























