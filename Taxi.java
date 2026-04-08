class Taxi {

    String taxiNumber;
    String driverName;
    int seats;
    long trips;
    String location;
    boolean isAvailable;
    boolean isOnline;
    float speed;
    double fare;
    char type;
    byte rating;

    public static boolean startRide(boolean status) {
        System.out.println("Ride Started: " + status);
        return status;
    }

    public static int pickPassengers(int count) {
        System.out.println("Passengers Picked: " + count);
        return count;
    }

    public static long totalTrips(long count) {
        System.out.println("Trips: " + count);
        return count;
    }

    public static float setSpeed(float speed) {
        System.out.println("Speed: " + speed);
        return speed;
    }

    public static double calculateFare(double fare) {
        System.out.println("Fare: " + fare);
        return fare;
    }

    public static char taxiType(char type) {
        System.out.println("Type: " + type);
        return type;
    }

    public static byte driverRating(byte rating) {
        System.out.println("Rating: " + rating);
        return rating;
    }

    public static String currentLocation(String location) {
        System.out.println("Location: " + location);
        return location;
    }

    public static boolean checkAvailability(boolean status) {
        System.out.println("Available: " + status);
        return status;
    }

    public static boolean endRide(boolean status) {
        System.out.println("Ride Ended: " + status);
        return status;
    }
}