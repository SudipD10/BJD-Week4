package Day3Assignment;

import java.util.ArrayList;
import java.util.List;

public class reverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(18);
        list.add(15);
        list.add(26);
        list.add(19);
        reverse(list);
        System.out.println(list);

    }

    public static void reverse(List<Integer> list){
        int end = list.size() - 1;
        for(int i = 0; i<list.size()/2; i++){
            Integer temp = list.get(i);
            list.set(i, list.get(end-i));
            list.set(end-i, temp);
        }
    }
}
