package unit9;

public class SchoolDistrictInheritanceLabPractical {
    public static void main(String[] args) {

    }

    static class Employee {
        private String name;
        private String jobTitle;
        private String building;

        public Employee(String name, String jobTitle, String building) {
            this.name = name;
            this.jobTitle = jobTitle;
            this.building = building;
        }

        @Override
        public String toString() {
            return String.format("My name is %s and I am a %s that works at %s.", name, jobTitle, building);
        }
    }

    static class Superintendent extends Employee {
        private int salary;
        private String degree;

        public Superintendent(String name, String jobTitle, String building, int salary, String degree) {
            super(name, jobTitle, building);
            this.salary = salary;
            this.degree = degree;
        }

        @Override
        public String toString() {
            return super.toString() + String.format(" My salary is %s. I hold a %s.", salary, degree);
        }
    }
}
