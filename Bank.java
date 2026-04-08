class Bank {

    String bankName;
    String branch;
    int employees;
    long customers;
    String accountType;
    boolean hasLoan;
    boolean hasATM;
    float interestRate;
    double balance;
    char accountCategory;
    byte branchCode;

    public static boolean openBank(boolean status) {
        System.out.println("Bank Open: " + status);
        return status;
    }

    public static int addCustomers(int count) {
        System.out.println("Customers Added: " + count);
        return count;
    }

    public static long totalCustomers(long count) {
        System.out.println("Total Customers: " + count);
        return count;
    }

    public static float setInterest(float rate) {
        System.out.println("Interest Rate: " + rate);
        return rate;
    }

    public static double accountBalance(double amount) {
        System.out.println("Balance: " + amount);
        return amount;
    }

    public static char accountType(char type) {
        System.out.println("Account Category: " + type);
        return type;
    }

    public static byte branchCode(byte code) {
        System.out.println("Branch Code: " + code);
        return code;
    }

    public static String branchName(String name) {
        System.out.println("Branch: " + name);
        return name;
    }

    public static boolean checkATM(boolean status) {
        System.out.println("ATM Available: " + status);
        return status;
    }

    public static boolean closeBank(boolean status) {
        System.out.println("Bank Closed: " + status);
        return status;
    }
}