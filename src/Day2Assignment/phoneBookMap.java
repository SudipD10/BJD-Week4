package Day2Assignment;

import java.util.HashMap;
import java.util.Map;

public class phoneBookMap {

    public static Map<String, Integer> map = new HashMap<>();


    public static void main(String[] args) {
        addEntry(" Peter ", 625344);
        addEntry(" John ", 768736);
        addEntry(" Paula ", 457637);
        printAll();
        searchEntry();
        deleteEntry();
        printAll();

    }

    private static void addEntry(String name, int number) {
        if(map.containsKey(name)){
            System.out.println(" Name already Exists. ");
        }
        map.put(name, number);
        System.out.println(" User " + name + " Added in PhoneBook. ");
    }

    private static void deleteEntry() {
        if (map.containsKey(" Paula ")) {
            map.remove(" Paula ");
            System.out.println(" Name has been Deleted from Phonebook. ");
        }
    }

    private static void searchEntry() {
        if (map.containsKey(" Peter ")) {
            System.out.println(" Name and Number is found. ");
            System.out.println(" Peter " + " , " + map.get(" Peter "));

        }
    }
    private static void printAll () {
            for (Map.Entry<String, Integer> values : map.entrySet()) {
                System.out.println(values.getKey() + " " + values.getValue());
            }
        }


}
