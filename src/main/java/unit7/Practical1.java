package unit7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practical1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Andy", "Bartholomew", "abc",
                "def", "ghi", "abc",
                "def", "ghi", "abc");

        for (int i = 0; i < names.size(); i = i + 3) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-15s", names.get(i + j));
            }
            System.out.printf("%n");
        }

        // Now randomized
        List<String> names2 = new ArrayList<>(names);

        int counter = 0;
        while (names2.size() > 0) {
            int randomIndex = (int)(Math.random() * names2.size());
            String name = names2.remove(randomIndex);
            if (counter % 3 == 0) {
                System.out.println();
            }

            System.out.printf("%-15s", name);

            counter++;
        }
    }
}
