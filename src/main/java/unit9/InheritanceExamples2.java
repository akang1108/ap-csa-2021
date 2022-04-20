package unit9;

public class InheritanceExamples2 {
    public static void main(String[] args) {
        System.out.println("Instantiating Class1");
        Class1 class1 = new Class1();
        System.out.println("Instantiating Class2");
        Class2 class2 = new Class2();
        System.out.println("Instantiating Class3");
        Class3 class3 = new Class3();
    }

    public static class Class1 {
        public Class1() {
            System.out.println("Class1 no args constructor");
        }
    }

    public static class Class2 extends Class1 {
    }

    public static class Class3 extends Class1 {
        public Class3() {
            System.out.println("Class3 no args constructor");
        }
    }
}
