
import java.util.Scanner;

public class Assign {
    public static void WordCount(String sentence){
        String[] words = sentence.split(" ");
        int count = words.length;
        System.out.println("Number of words in the sentence: " + count);
    }

    public static void Reverse(String sentence){
        String[] words = sentence.split(" ");
        System.out.print("Reversed sentence: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }

    public static void FindSmallestWord(String sentence){
        String[] words = sentence.split(" ");
        if (words.length == 0) {
            System.out.println("No words found in the sentence.");
            return;
        }
        String smallestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallestWord.length()) {
                smallestWord = words[i];
            }
        }
        System.out.println("Smallest word in the sentence: " + smallestWord);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String x = s.nextLine();
        WordCount(x);
        Reverse(x);
        FindSmallestWord(x);
        s.close();
    }
}
