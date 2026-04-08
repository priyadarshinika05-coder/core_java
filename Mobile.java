class Mobile {

    String brand;
    String model;
    int storage;
    long imei;
    String os;
    boolean has5G;
    boolean hasDualSim;
    float screenSize;
    double price;
    char series;
    byte cameraCount;

    public static boolean powerOn(boolean status) {
        System.out.println("Mobile ON: " + status);
        return status;
    }

    public static int installApps(int count) {
        System.out.println("Apps Installed: " + count);
        return count;
    }

    public static long totalStorage(long space) {
        System.out.println("Storage: " + space);
        return space;
    }

    public static float displaySize(float size) {
        System.out.println("Screen Size: " + size);
        return size;
    }

    public static double mobilePrice(double price) {
        System.out.println("Price: " + price);
        return price;
    }

    public static char mobileSeries(char type) {
        System.out.println("Series: " + type);
        return type;
    }

    public static byte cameras(byte count) {
        System.out.println("Camera Count: " + count);
        return count;
    }

    public static String operatingSystem(String os) {
        System.out.println("OS: " + os);
        return os;
    }

    public static boolean check5G(boolean status) {
        System.out.println("5G Available: " + status);
        return status;
    }

    public static boolean powerOff(boolean status) {
        System.out.println("Mobile OFF: " + status);
        return status;
    }
}