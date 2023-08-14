package Day3Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class removeEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbList = new ArrayList<>();
        numbList.add(7);
        numbList.add(2);
        numbList.add(18);
        numbList.add(15);
        numbList.add(26);
        numbList.add(19);
        for(Iterator<Integer> i = numbList.iterator(); i.hasNext();){
            System.out.println(i);
        }

        deleteEven(numbList);
        System.out.println(numbList);
    }

    public static void deleteEven(ArrayList<Integer> numbList){
        numbList.removeIf(num -> num % 2 == 0);
    }
}
