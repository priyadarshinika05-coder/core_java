class Hospital {

    String hospitalName;
    String location;
    int beds;
    long patients;
    String department;
    boolean hasICU;
    boolean hasAmbulance;
    float rating;
    double treatmentCost;
    char category;
    byte floors;

    public static boolean openHospital(boolean status) {
        System.out.println("Hospital Open: " + status);
        return status;
    }

    public static int admitPatients(int count) {
        System.out.println("Patients Admitted: " + count);
        return count;
    }

    public static long totalPatients(long count) {
        System.out.println("Total Patients: " + count);
        return count;
    }

    public static float setRating(float rating) {
        System.out.println("Rating: " + rating);
        return rating;
    }

    public static double treatmentCost(double cost) {
        System.out.println("Treatment Cost: " + cost);
        return cost;
    }

    public static char hospitalCategory(char type) {
        System.out.println("Category: " + type);
        return type;
    }

    public static byte floorCount(byte count) {
        System.out.println("Floors: " + count);
        return count;
    }

    public static String departmentName(String dept) {
        System.out.println("Department: " + dept);
        return dept;
    }

    public static boolean checkICU(boolean status) {
        System.out.println("ICU Available: " + status);
        return status;
    }

    public static boolean closeHospital(boolean status) {
        System.out.println("Hospital Closed: " + status);
        return status;
    }
}