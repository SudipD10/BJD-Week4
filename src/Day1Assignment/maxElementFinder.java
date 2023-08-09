package Day1Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class maxElementFinder {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        int max = findMaxElement(numbers);
        System.out.println(" The maximum element is: " + max);
    }

    public static int findMaxElement(ArrayList<Integer> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException(" List Is Empty ");
        }
        return Collections.max(list);

    }
}
