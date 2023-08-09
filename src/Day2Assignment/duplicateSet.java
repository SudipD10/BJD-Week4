package Day2Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateSet {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(17);
        integerList.add(23);
        integerList.add(35);
        integerList.add(23);
        integerList.add(39);
        integerList.add(17);
        integerList.add(39);

        Set<Integer> uniqueIntegers = new HashSet<>(integerList);
        System.out.println(" List of integers with duplicates: ");
        System.out.println(integerList);
        System.out.println(" List of Integers without duplicates: ");
        System.out.println(uniqueIntegers);
    }
}
