package kytu;

import java.util.HashMap;
import java.util.Map;

public class DocKyTu {
    public static void main(String[] args) {
        // Mảng các chuỗi đầu vào
        String[] sentences = {
            "learn java by example",
            "guide to advance java",
            "example of distributed in java"
        };
        Map<String, Integer> wordCount = new HashMap<>();

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            for (String word : words) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } 
                else {
                    wordCount.put(word, 1);
                }
            }
        }
        int sumWord = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            sumWord += entry.getValue();
        }
        System.out.println("tong so tu: " + sumWord);
    }
}
