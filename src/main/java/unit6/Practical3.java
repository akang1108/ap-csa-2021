package unit6;

import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string consisting of at least 2 words: ");
        String userString = scanner.next();

        String[] characters = new String[userString.length()];
        System.out.println("the array:");
        for (int i = 0; i < userString.length(); i++) {
            characters[i] = userString.substring(i, i + 1);
        }

//        for (int i = 0; i < numWords; i++) {
//            System.out.println("(" + i + ") Type a word, some should start with the letter 'a'");
//            String word = scanner.next();
//            words[i] = word;
//        }
//
//        System.out.print("Original list: ");
//        for (String word: words) {
//            System.out.print(word + " ");
//        }
//        System.out.println();
//
//        String concat = "";
//
//        for (String word: words) {
//            if (word.startsWith("a")) {
//                concat += word + " ";
//            }
//        }
//        System.out.println("All words that start with 'a': " + concat);
//
//        scanner.close();
    }
}
