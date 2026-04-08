class Bus {

    String busNumber;
    String busName;
    int seatingCapacity;
    int numberOfPassengers;
    String route;
    boolean isAC;
    boolean hasSleeper;
    int speedLimit;
    int totalStops;
    int establishedYear;

    public static boolean startBus(boolean status) {
        System.out.println("Bus Started: " + status);
        return status;
    }

    public static boolean stopBus(boolean status) {
        System.out.println("Bus Stopped: " + status);
        return status;
    }

    public static boolean boardPassengers(int count) {
        System.out.println("Passengers Boarded: " + count);
        return true;
    }

    public static boolean dropPassengers(int count) {
        System.out.println("Passengers Dropped: " + count);
        return true;
    }

    public static boolean openDoor(boolean status) {
        System.out.println("Door Open: " + status);
        return status;
    }

    public static boolean closeDoor(boolean status) {
        System.out.println("Door Closed: " + status);
        return status;
    }

    public static boolean announceStop(String stop) {
        System.out.println("Next Stop: " + stop);
        return true;
    }

    public static boolean checkTickets(boolean status) {
        System.out.println("Tickets Checked: " + status);
        return status;
    }

    public static boolean maintainBus(boolean status) {
        System.out.println("Bus Maintained: " + status);
        return status;
    }

    public static boolean cleanBus(boolean status) {
        System.out.println("Bus Cleaned: " + status);
        return status;
    }
}