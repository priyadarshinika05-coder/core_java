class Restaurant {

    String name;
    String location;
    int tables;
    long customers;
    String cuisine;
    boolean hasAC;
    boolean hasDelivery;
    float rating;
    double avgCost;
    char category;
    byte chefs;

    public static boolean openRestaurant(boolean status) {
        System.out.println("Restaurant Open: " + status);
        return status;
    }

    public static int serveCustomers(int count) {
        System.out.println("Customers Served: " + count);
        return count;
    }

    public static long totalCustomers(long count) {
        System.out.println("Total Customers: " + count);
        return count;
    }

    public static float setRating(float rating) {
        System.out.println("Rating: " + rating);
        return rating;
    }

    public static double averageCost(double cost) {
        System.out.println("Average Cost: " + cost);
        return cost;
    }

    public static char restaurantCategory(char type) {
        System.out.println("Category: " + type);
        return type;
    }

    public static byte chefCount(byte count) {
        System.out.println("Chefs: " + count);
        return count;
    }

    public static String cuisineType(String cuisine) {
        System.out.println("Cuisine: " + cuisine);
        return cuisine;
    }

    public static boolean checkDelivery(boolean status) {
        System.out.println("Delivery Available: " + status);
        return status;
    }

    public static boolean closeRestaurant(boolean status) {
        System.out.println("Restaurant Closed: " + status);
        return status;
    }
}