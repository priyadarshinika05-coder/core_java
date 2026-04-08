class Delivery {

    String orderId;
    String location;
    int items;
    long orders;
    String deliveryType;
    boolean isFast;
    boolean isPaid;
    float deliveryTime;
    double charges;
    char status;
    byte agentId;

    public static boolean startDelivery(boolean status) {
        System.out.println("Delivery Started: " + status);
        return status;
    }

    public static int deliverItems(int count) {
        System.out.println("Items Delivered: " + count);
        return count;
    }

    public static long totalOrders(long count) {
        System.out.println("Orders: " + count);
        return count;
    }

    public static float deliveryTime(float time) {
        System.out.println("Time: " + time);
        return time;
    }

    public static double deliveryCharges(double charge) {
        System.out.println("Charges: " + charge);
        return charge;
    }

    public static char deliveryStatus(char status) {
        System.out.println("Status: " + status);
        return status;
    }

    public static byte assignAgent(byte id) {
        System.out.println("Agent ID: " + id);
        return id;
    }

    public static String deliveryType(String type) {
        System.out.println("Type: " + type);
        return type;
    }

    public static boolean checkFast(boolean status) {
        System.out.println("Fast Delivery: " + status);
        return status;
    }

    public static boolean completeDelivery(boolean status) {
        System.out.println("Delivery Completed: " + status);
        return status;
    }
}