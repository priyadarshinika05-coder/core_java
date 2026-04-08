class ShoppingMall {

    String mallName;
    String location;
    int shops;
    long visitors;
    String type;
    boolean hasParking;
    boolean hasFoodCourt;
    float rating;
    double revenue;
    char category;
    byte floors;

    public static boolean openMall(boolean status) {
        System.out.println("Mall Open: " + status);
        return status;
    }

    public static int addShops(int count) {
        System.out.println("Shops Added: " + count);
        return count;
    }

    public static long totalVisitors(long count) {
        System.out.println("Visitors: " + count);
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

    public static char mallCategory(char type) {
        System.out.println("Category: " + type);
        return type;
    }

    public static byte floorCount(byte count) {
        System.out.println("Floors: " + count);
        return count;
    }

    public static String mallType(String type) {
        System.out.println("Type: " + type);
        return type;
    }

    public static boolean checkParking(boolean status) {
        System.out.println("Parking Available: " + status);
        return status;
    }

    public static boolean closeMall(boolean status) {
        System.out.println("Mall Closed: " + status);
        return status;
    }
}