package Day2Assignment;

import java.util.ArrayList;
public class targetSum {
    public static void main(String[] args) {

        ArrayList<Integer> numbs = new ArrayList<>();
        numbs.add(3);
        numbs.add(4);
        numbs.add(2);
        numbs.add(1);
        numbs.add(9);
        int target = 5;

        System.out.println(findIntegers(numbs, target));

    }

    private static ArrayList<Integer> findIntegers(ArrayList<Integer> numbs, int target) {
        ArrayList<Integer> foundNum = new ArrayList<>();
        for (Integer num : numbs){
            if(numbs.contains(target - num)){
                foundNum.add(num);
                foundNum.add(numbs.get(numbs.indexOf(target - num)));
                break;
            }
        }
        return foundNum;
    }





}
