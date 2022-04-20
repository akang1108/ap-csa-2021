package unit9;

public class InheritanceExamples {
    public static void main(String[] args) {

    }

    public static class Vehicle {
        private String name;
        private boolean canFly;
        public Vehicle() {}
        public Vehicle(String name, boolean canFly) {
            this.name = name;
            this.canFly = canFly;
        }
        public String getName() { return name; }
        public boolean isCanFly() { return canFly; }
    }

    public static class Car extends Vehicle {
        public Car(String name, boolean canFly, int wheelSize) {
            super(name, canFly);
            this.wheelSize = wheelSize;
        }
        private int wheelSize;
        public int getWheelSize() { return wheelSize; }
    }

    public static class ElectricCar extends Car {
        public ElectricCar(String name, boolean canFly, int wheelSize, int numberOfBatteries) {
            super(name, canFly, wheelSize);
            this.numberOfBatteries = numberOfBatteries;
        }
        private int numberOfBatteries;
        public int getNumberOfBatteries() { return numberOfBatteries; }
    }
}
