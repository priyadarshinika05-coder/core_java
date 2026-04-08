class Car {

    String brand;
    String model;
    int seatingCapacity;
    long mileage;
    String fuelType;
    boolean hasAC;
    boolean isAutomatic;
    float speed;
    double price;
    char segment;
    byte gearCount;

    public static boolean startCar(boolean status) {
        System.out.println("Car Started: " + status);
        return status;
    }

    public static int accelerate(int speed) {
        System.out.println("Speed Increased: " + speed);
        return speed;
    }

    public static long totalDistance(long km) {
        System.out.println("Distance Travelled: " + km);
        return km;
    }

    public static float setSpeed(float speed) {
        System.out.println("Speed Set: " + speed);
        return speed;
    }

    public static double carPrice(double price) {
        System.out.println("Car Price: " + price);
        return price;
    }

    public static char carSegment(char type) {
        System.out.println("Car Segment: " + type);
        return type;
    }

    public static byte gear(byte count) {
        System.out.println("Gear Count: " + count);
        return count;
    }

    public static String fuel(String type) {
        System.out.println("Fuel Type: " + type);
        return type;
    }

    public static boolean checkAC(boolean status) {
        System.out.println("AC Available: " + status);
        return status;
    }

    public static boolean stopCar(boolean status) {
        System.out.println("Car Stopped: " + status);
        return status;
    }
}