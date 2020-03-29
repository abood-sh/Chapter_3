package chapter3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class FirstQuestion {

    public static void main(String[] args) {
        Random random = new Random();
        int number, sum = 0;
        float avg;
        
        LinkedList<Integer> list = new LinkedList<>();

        for (int counter = 0; counter < 30; counter++) {
            
            number = random.nextInt(100);
            list.add(number);
            sum += number;
        }

        Collections.sort(list);

        System.out.println("The Sum= " + sum);
        
        System.out.println(" Average Of The Elements = " + sum / list.size());

    }

}
