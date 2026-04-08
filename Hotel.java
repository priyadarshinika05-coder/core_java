class Hotel {

    String hotelName;
    String location;
    int rooms;
    long guests;
    String type;
    boolean hasWifi;
    boolean hasPool;
    float rating;
    double pricePerNight;
    char category;
    byte floorCount;

    public static boolean openHotel(boolean status) {
        System.out.println("Hotel Open: " + status);
        return status;
    }

    public static int checkInGuests(int count) {
        System.out.println("Guests Checked In: " + count);
        return count;
    }

    public static long totalGuests(long count) {
        System.out.println("Total Guests: " + count);
        return count;
    }

    public static float setRating(float rating) {
        System.out.println("Rating: " + rating);
        return rating;
    }

    public static double roomPrice(double price) {
        System.out.println("Room Price: " + price);
        return price;
    }

    public static char hotelCategory(char type) {
        System.out.println("Category: " + type);
        return type;
    }

    public static byte floors(byte count) {
        System.out.println("Floors: " + count);
        return count;
    }

    public static String hotelType(String type) {
        System.out.println("Type: " + type);
        return type;
    }

    public static boolean checkWifi(boolean status) {
        System.out.println("WiFi Available: " + status);
        return status;
    }

    public static boolean closeHotel(boolean status) {
        System.out.println("Hotel Closed: " + status);
        return status;
    }
}