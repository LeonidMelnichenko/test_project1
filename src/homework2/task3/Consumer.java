package src.homework2.task3;
    public class Consumer {
        private final int[] lastNumbersArray;
        public Consumer(int arraysize) {
            this.lastNumbersArray = new int[arraysize];
        }
        private int counter = 0;
        private int iteraition = 0;

        public void consume(int lastNumber) {
            lastNumbersArray[counter] = lastNumber;
                counter++;
                iteraition++;
            if (counter == lastNumbersArray.length) {
                counter = 0;
            }
        }
        public double avg() {
            double sum = 0;
                for (int i = 0; i < lastNumbersArray.length; i++) {
                    sum += lastNumbersArray[i];
                }
                if(iteraition < 5){
                    System.out.println(sum/iteraition);
                } else {
                    System.out.println(sum/5);
                }
                return 0;
            }
        }






























