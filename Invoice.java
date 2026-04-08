class Invoice {

    String invoiceNumber;
    String customerName;
    int itemCount;
    long totalItems;
    String paymentMode;
    boolean isPaid;
    boolean hasDiscount;
    float taxRate;
    double totalAmount;
    char status;
    byte billNo;

    public static boolean generateInvoice(boolean status) {
        System.out.println("Invoice Generated: " + status);
        return status;
    }

    public static int addItems(int count) {
        System.out.println("Items Added: " + count);
        return count;
    }

    public static long totalItems(long count) {
        System.out.println("Total Items: " + count);
        return count;
    }

    public static float setTax(float tax) {
        System.out.println("Tax Rate: " + tax);
        return tax;
    }

    public static double totalAmount(double amount) {
        System.out.println("Total Amount: " + amount);
        return amount;
    }

    public static char invoiceStatus(char status) {
        System.out.println("Status: " + status);
        return status;
    }

    public static byte billNumber(byte number) {
        System.out.println("Bill No: " + number);
        return number;
    }

    public static String paymentType(String type) {
        System.out.println("Payment Mode: " + type);
        return type;
    }

    public static boolean checkPaid(boolean status) {
        System.out.println("Paid: " + status);
        return status;
    }

    public static boolean closeInvoice(boolean status) {
        System.out.println("Invoice Closed: " + status);
        return status;
    }
}