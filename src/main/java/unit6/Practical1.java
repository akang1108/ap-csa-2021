package unit6;

import java.util.Scanner;

public class Practical1 {
    public static void main(String[] args) {
        int numWords = 3;

        Scanner scanner = new Scanner(System.in);
        String[] words = new String[numWords];

        for (int i = 0; i < numWords; i++) {
            System.out.println("(" + i + ") Type a word, some should start with the letter 'a'");
            String word = scanner.next();
            words[i] = word;
        }

        System.out.print("Original list: ");
        for (String word: words) {
            System.out.print(word + " ");
        }
        System.out.println();

        String concat = "";

        for (String word: words) {
            if (word.startsWith("a")) {
                concat += word + " ";
            }
        }
        System.out.println("All words that start with 'a': " + concat);

        scanner.close();
    }
}
