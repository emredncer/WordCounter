import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the text here: ");
        String text = input.nextLine();

        //I defined an array to hold the words that will be formed when we split the text into words.
        String[] words = text.split(" ");

        //A HashMap was generated to hold the repetition numbers corresponding to the words as key-value pairs.
        HashMap<String, Integer> wordMap = new HashMap<>();

        //I used nested foreach to go through the words and check if they are the same.
        for (String x : words) {
            int count = 0;
            for (String y : words) {
                if (x.equals(y)) {
                    count++;
                }
            }
            wordMap.put(x, count);
        }


        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        //I used foreach to find the pair with the highest value in the hashmap.
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Most repeated word: "+maxKey);
        System.out.println("Number of repetation: "+maxValue);
    }

}
