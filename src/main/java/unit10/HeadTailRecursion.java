package unit10;

public class HeadTailRecursion {
    public static final int MAX = 100;

    public static void main(String[] args) {
        System.out.print("tailRecursion: ");
        tailRecursion(0);
        System.out.println();

        System.out.print("headRecursion: ");
        headRecursion(0);
        System.out.println();
    }

    static int tailRecursion(int accum) {
        if (accum > MAX) {
            return accum;
        }

        accum = accum + 1;
        System.out.print(accum + " ");

        return tailRecursion(accum);
    }

    static int headRecursion(int accum) {
        if (accum > MAX) {
            return accum;
        }

        accum = accum + 1;

        headRecursion(accum);
        System.out.print(accum + " ");

        return accum;
    }
}
