package unit10;

/**
 * Unit 10 Recursion MC 10.1
 * Unit 10 Recursion MC 10.2
 */
public class Unit10MC {
    public static void main(String[] args) {
        String scramble = mc10_1_6_recScramble("epic", new int[] {2, 1, 1}, 0);
        System.out.println(scramble);
        assert scramble.equals("ipce");
    }

    /**
     * String scramble = mc10_1_6_recScramble("epic", new int[] {2, 1, 1}, 0);
     *
     * call 1 - recScramble str="epic" positions=2,1,1 k=0
     * pos=positions[0] -> 2
     * nStr="i" (index 2 or letter 3)
     * str="ep" + "c"
     *
     * call 2 - recScramble str="epc" positions=2,1,1 k=1
     * pos=positions[1] -> 1
     * nStr="p"
     * str="e" + "c"
     *
     * call 3 - recScramble str="ec" positions=2,1,1 k=2
     * pos=positions[2] -> 1
     * nStr="c"
     * str="e" + ""
     *
     * call 4 - recScramble str="e" positions=2,1,1 k=3
     * return "e" since str is length 1
     *
     * so return up the recursion "i" + "p" + "c" + "e"
     */
    static String mc10_1_6_recScramble(String str, int[] positions, int k) {
        if (str == null || str.length() == 0) return "";
        if (str.length() == 1) return str;
        int pos = positions[k];
        String nStr = str.substring(pos, pos + 1);
        str = str.substring(0, pos) + str.substring(pos + 1); return nStr + mc10_1_6_recScramble(str, positions, k + 1);
    }
}
