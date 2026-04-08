class Bike {

    String brand;
    String model;
    double price;
    String color;
    int mileage;
    int engineCC;
    String fuelType;
    boolean hasABS;
    int year;
    String type;

    static String category = "TwoWheeler";
    static String country = "India";

    public static String startBike(String status) {
        System.out.println("Bike started: " + status);
        return status;
    }

    public static int accelerate(int speed) {
        System.out.println("Speed: " + speed);
        return speed;
    }

    public static boolean applyBrake(boolean status) {
        System.out.println("Brake applied: " + status);
        return status;
    }

    public static double refuel(double amount) {
        System.out.println("Fuel added: " + amount);
        return amount;
    }

    public static String changeGear(String gear) {
        System.out.println("Gear changed: " + gear);
        return gear;
    }

    public static boolean turnIndicator(boolean status) {
        System.out.println("Indicator: " + status);
        return status;
    }

    public static int checkMileage(int mileage) {
        System.out.println("Mileage: " + mileage);
        return mileage;
    }

    public static boolean lockBike(boolean status) {
        System.out.println("Bike locked: " + status);
        return status;
    }

    public static String stopBike(String status) {
        System.out.println("Bike stopped: " + status);
        return status;
    }

    public static boolean serviceBike(boolean status) {
        System.out.println("Bike serviced: " + status);
        return status;
    }
}