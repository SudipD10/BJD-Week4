package Day1Assignment;

import java.util.ArrayList;



public class mergedArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(25);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(35);

        ArrayList<Integer> mergedList = mergeLists(list1, list2);
        System.out.println(" Merged ArrayList: " + mergedList);
    }
        public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        return mergedList;
        }
}
