import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordPairs {
    public static void main(String[] args) {
        String[] words = {
                "hello",
                "there",
                "how",
                "do",
                "you",
                "do"
        };

        WordPairsList wordPairsList = new WordPairsList(words);

        System.out.println(wordPairsList);


        //
        // Combinations (not permutations): for n number of things, choose k of them.
        //       n!
        // -------------
        //  k! (n - k)!
        //

        int n = words.length;
        int k = 2;
        long numCombinations = factorial(n) / (factorial(k) * factorial(n - k));

        System.out.println("Calculating number of combinations with formula: " + numCombinations);
        System.out.println("Should match number of word pairs created: " + wordPairsList.getAllPairs().size());
    }

    public static long factorial(int n) {
        if (n <= 2) {
            return n;
        }

        return n * factorial(n - 1);
    }

    static class WordPairsList {
        private final List<WordPair> allPairs;

        public WordPairsList(String... words) {
            allPairs = new ArrayList<>();

            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    WordPair pair = new WordPair(words[i], words[j]);
                    allPairs.add(pair);
                }
            }
        }

        public List<WordPair> getAllPairs() {
            return allPairs;
        }

        @Override
        public String toString() {
            return allPairs.stream().map(WordPair::toString).collect(Collectors.joining("\n"));
        }
    }

    static class WordPair {
        private String word1;
        private String word2;

        public WordPair(String word1, String word2) {
            this.word1 = word1;
            this.word2 = word2;
        }

        public String getWord1() {
            return word1;
        }

        public String getWord2() {
            return word2;
        }

        @Override
        public String toString() {
            return "WordPair{" +
                    "word1='" + word1 + '\'' +
                    ", word2='" + word2 + '\'' +
                    '}';
        }
    }
}
