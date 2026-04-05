class Uber {

    String driverName;
    String location;
    double fare;
    boolean isRideCompleted;

    public Uber() {
        this("Ramesh", "BTM");
        System.out.println("Details 1st");
    }

    public Uber(String driverName) {
        System.out.println("Driver: " + driverName);
        System.out.println("Details 2nd");
    }

    public Uber(String driverName, String location) {
        System.out.println("Driver: " + driverName);
        System.out.println("Location: " + location);
        System.out.println("Details 3rd");
    }

    public Uber(String driverName, String location, double fare) {
        System.out.println("Driver: " + driverName);
        System.out.println("Location: " + location);
        System.out.println("Fare: " + fare);
        System.out.println("Details 4th");
    }

    public Uber(String driverName, String location, double fare, boolean isRideCompleted) {
        System.out.println("Driver: " + driverName);
        System.out.println("Location: " + location);
        System.out.println("Fare: " + fare);
        System.out.println("Ride Completed: " + isRideCompleted);
        System.out.println("Details 5th");
    }
}