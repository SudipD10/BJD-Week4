package Day3Assignment;

import java.util.HashMap;
import java.util.Map;

public class targetSum {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] num = {2, 7, 5, 4, 8, 13};
        int target = 9;
        for(int i = 0; i<num.length; i++){
            if(map.containsKey(target - num[i])){
                System.out.println(map.get(target - num[i]) + " , " + i);
                break;
            }
            map.put(num[i], i);
        }
    }
}
