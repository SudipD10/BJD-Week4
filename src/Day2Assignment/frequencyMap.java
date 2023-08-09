package Day2Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class frequencyMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a Sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("//s+");
        Map<String, Integer> wordFrequencyMap;
        wordFrequencyMap = new HashMap<>();
        for (String word : words){
            word = word.toLowerCase();
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word,0) + 1 );
        }

        System.out.println(" Word Frequencies: ");
        for (Map.Entry<String, Integer>entry : wordFrequencyMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        scanner.close();


    }
}
