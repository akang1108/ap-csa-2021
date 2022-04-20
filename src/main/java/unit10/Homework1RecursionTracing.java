package unit10;

public class Homework1RecursionTracing {

    public static void main(String[] args) {
        System.out.println(surprise(1467811));
        System.out.println(surprise(7754));
        System.out.println(surprise(58216));
        System.out.println(recur("avocado"));
        printDollarSign(5);
    }

    public static void printDollarSign(int k) {
        int j;
        if(k>0) {
            for(j=1; j <= k; j++)
                System.out.print("$");
            System.out.println();
            printDollarSign(k - 1);
        }
    }

    public static int surprise(int b){
        if ((b % 2) == 0) {
            if (b < 10)
                return b;
            else
                return ((b % 10) + surprise(b / 10));
        }
        else {
            if (b < 10)
                return 0;
            else
                return surprise(b / 10);
        }
    }

    public static String recur(String str){
        int len = str.length();
        if (len >= 2){
            String next = str.substring(0, len - 2);
            return str.substring(len - 2) + recur(next);
        } else
            return str;
    }
}
