package unit9;

public class InheritanceExamples6 {

    static class A {
        int x;
        public int method() {
            x = 10;
            return x;
        } //method
    } // class A

    static class B extends A {
        int x;
        public int method() {
//            super();
            x = 20;
            return x;
        }
    } // class B

    public static void main(String[] args) {
        A myclass = new B();
        int num1 = myclass.method();
        System.out.println(num1);
    }
}
