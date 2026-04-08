class Supermarket {

    String name;
    String location;
    int items;
    long customers;
    String category;
    boolean hasOnline;
    boolean hasDiscounts;
    float rating;
    double revenue;
    char size;
    byte counters;

    public static boolean openStore(boolean status) {
        System.out.println("Store Open: " + status);
        return status;
    }

    public static int addItems(int count) {
        System.out.println("Items Added: " + count);
        return count;
    }

    public static long totalCustomers(long count) {
        System.out.println("Customers: " + count);
        return count;
    }

    public static float setRating(float rating) {
        System.out.println("Rating: " + rating);
        return rating;
    }

    public static double totalRevenue(double amount) {
        System.out.println("Revenue: " + amount);
        return amount;
    }

    public static char storeSize(char type) {
        System.out.println("Size: " + type);
        return type;
    }

    public static byte billingCounters(byte count) {
        System.out.println("Counters: " + count);
        return count;
    }

    public static String storeCategory(String type) {
        System.out.println("Category: " + type);
        return type;
    }

    public static boolean checkOnline(boolean status) {
        System.out.println("Online Available: " + status);
        return status;
    }

    public static boolean closeStore(boolean status) {
        System.out.println("Store Closed: " + status);
        return status;
    }
}