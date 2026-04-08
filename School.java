class School {

    String schoolName;
    String location;
    int students;
    long staff;
    String boardType;
    boolean hasLibrary;
    boolean hasPlayground;
    float rating;
    double fee;
    char gradeType;
    byte floors;

    public static boolean openSchool(boolean status) {
        System.out.println("School Open: " + status);
        return status;
    }

    public static int admitStudents(int count) {
        System.out.println("Students Admitted: " + count);
        return count;
    }

    public static long totalStaff(long count) {
        System.out.println("Total Staff: " + count);
        return count;
    }

    public static float setRating(float rating) {
        System.out.println("School Rating: " + rating);
        return rating;
    }

    public static double schoolFee(double fee) {
        System.out.println("Fee: " + fee);
        return fee;
    }

    public static char grade(char type) {
        System.out.println("Grade Type: " + type);
        return type;
    }

    public static byte buildingFloors(byte count) {
        System.out.println("Floors: " + count);
        return count;
    }

    public static String board(String type) {
        System.out.println("Board: " + type);
        return type;
    }

    public static boolean checkLibrary(boolean status) {
        System.out.println("Library Available: " + status);
        return status;
    }

    public static boolean closeSchool(boolean status) {
        System.out.println("School Closed: " + status);
        return status;
    }
}