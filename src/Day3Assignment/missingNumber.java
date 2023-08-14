package Day3Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class missingNumber {
    public static void main(String[] args) {
        Map<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(9);

        for(int i = 0; i<=list.size(); i++){
            map.put(i, true);
        }
        for(Integer element : list){
            if(map.containsKey(element)){
                map.remove(element);
            }
        }
        System.out.println(map.entrySet().iterator().next().getKey());
    }
}
