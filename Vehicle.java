
package vehicles;

public class Vehicle {
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    private String chassisNo;
    private String model;

    public Vehicle(String model) {
        numVehicles++;
        this.chassisNo = "ch" + numVehicles;
        this.model = model;

        System.out.println("Vehicle manufactured");
    }

    public static class Engine extends Vehicle {
        private static final String ENGINE_MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        public Engine(String model) {
            super(model);
        }

        public static String getMake() {
            return ENGINE_MAKE;
        }

        public static int getCapacity() {
            return CAPACITY;
        }
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        MAKE = make;
    }

    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE
                + "\nThe model type is " + model
                + "\nThe chassis number is " + chassisNo
                + "\nThe engine make is " + Engine.getMake()
                + "\nThe engine capacity is " + Engine.getCapacity();
    }
}
