package unit9;

public class InheritanceExamples5 {
    public static void main(String[] args) {
        new B();
        new B("hello");
    }

    public static class A {
        public A() {
            System.out.println("I am A constructor no parameters!");
        }

        public A(String param) {
            System.out.println("I am A constructor with 1 parameter: " + param);
        }
    }

    public static class B extends A {
        public B() {
            System.out.println("I am B constructor no parameters!");
        }

        public B(String param) {
            super(param);
            System.out.println("I am B constructor with 1 parameter: " + param);
        }
    }
}
