package unit6;

public class Practical2 {
    public static void main(String[] args) {
        int num = 10;

        int[] numbers = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 20) + 1;
        }

        print("Original numbers array: ", numbers);

        //
        // Intention here is to end up with an array of only even numbers
        //
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i]++;
            }
        }
        print("Modified numbers array: ", numbers);
    }

    static void print(String prefix, int[] numbers) {
        System.out.print(prefix);

        for (int number: numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
