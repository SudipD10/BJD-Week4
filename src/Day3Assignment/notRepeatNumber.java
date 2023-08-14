package Day3Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class notRepeatNumber {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(26);
        list.add(15);
        list.add(26);
        list.add(15);
        list.add(2);

        for(Integer i : list){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
                continue;
            }
            map.put(i, 1);
        }
        for(int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
}
