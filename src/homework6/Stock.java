package src.homework6;

import static src.homework6.Factory.allParts;

public class Stock {

    public static synchronized void getParts() throws InterruptedException {
        int countArrays = 0;
        try {
            for (int i = 0; i < allParts.size(); i++){
                for (RoboParts r : allParts){
                    if(r.equals(Robot.terminator)){
                        Robot.terminator[i] = allParts.get(i);
                        countArrays++;
                    } else {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e){}
        notify();
    }

}
