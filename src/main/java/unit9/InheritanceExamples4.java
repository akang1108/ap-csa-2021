package unit9;

public class InheritanceExamples4 {
    public static void main(String[] args) {
        System.out.println(new B());
    }

    public static class A {
        public String name = "a";
    }

    public static class B extends A {
        public String name = "b";

        @Override
        public String toString() {
            return "super.name=" + super.name + ", name=" + name;
        }
    }
}
