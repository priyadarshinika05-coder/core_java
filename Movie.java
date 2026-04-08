class Movie {

    String title;
    String director;
    int duration;
    long audience;
    String genre;
    boolean is3D;
    boolean hasSubtitle;
    float rating;
    double collection;
    char certificate;
    byte screens;

    public static boolean startMovie(boolean status) {
        System.out.println("Movie Started: " + status);
        return status;
    }

    public static int audienceCount(int count) {
        System.out.println("Audience Count: " + count);
        return count;
    }

    public static long totalAudience(long count) {
        System.out.println("Total Audience: " + count);
        return count;
    }

    public static float movieRating(float rating) {
        System.out.println("Rating: " + rating);
        return rating;
    }

    public static double boxOffice(double amount) {
        System.out.println("Collection: " + amount);
        return amount;
    }

    public static char certificateType(char type) {
        System.out.println("Certificate: " + type);
        return type;
    }

    public static byte screenCount(byte count) {
        System.out.println("Screens: " + count);
        return count;
    }

    public static String movieGenre(String genre) {
        System.out.println("Genre: " + genre);
        return genre;
    }

    public static boolean check3D(boolean status) {
        System.out.println("3D Available: " + status);
        return status;
    }

    public static boolean endMovie(boolean status) {
        System.out.println("Movie Ended: " + status);
        return status;
    }
}