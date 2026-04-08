class Flight {

    String flightNumber;
    String airlineName;
    int seatingCapacity;
    int passengers;
    String source;
    String destination;
    boolean hasWifi;
    boolean hasFoodService;
    int speedLimit;
    int establishedYear;

    public static boolean takeOff(boolean status) {
        System.out.println("Flight Takeoff: " + status);
        return status;
    }

    public static boolean landFlight(boolean status) {
        System.out.println("Flight Landed: " + status);
        return status;
    }

    public static boolean boardPassengers(int count) {
        System.out.println("Passengers Boarded: " + count);
        return true;
    }

    public static boolean deboardPassengers(int count) {
        System.out.println("Passengers Deboarded: " + count);
        return true;
    }

    public static boolean openGate(boolean status) {
        System.out.println("Gate Open: " + status);
        return status;
    }

    public static boolean closeGate(boolean status) {
        System.out.println("Gate Closed: " + status);
        return status;
    }

    public static boolean announceFlight(String message) {
        System.out.println("Announcement: " + message);
        return true;
    }

    public static boolean checkSecurity(boolean status) {
        System.out.println("Security Checked: " + status);
        return status;
    }

    public static boolean serveFood(boolean status) {
        System.out.println("Food Served: " + status);
        return status;
    }

    public static boolean refuelFlight(boolean status) {
        System.out.println("Flight Refueled: " + status);
        return status;
    }
}