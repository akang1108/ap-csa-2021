package unit9;

public class InheritanceExample3 {
    public static void main(String[] args) {

    }

    class Parent {
        String prop1;
        protected String prop2;
        public String prop3;
    }

    class Child extends Parent {
        public void accessVars() {
            System.out.println(prop1); // Does not compile, prop1 is private
            System.out.println(prop2); // Works, prop2 is protected
            System.out.println(prop3); // Works, prop3 is public
        }
    }
}
