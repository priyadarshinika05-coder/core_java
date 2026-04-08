class Game {

    String gameName;
    String developer;
    int levels;
    long players;
    String genre;
    boolean isOnline;
    boolean hasMultiplayer;
    float rating;
    double revenue;
    char version;
    byte difficulty;

    public static boolean startGame(boolean status) {
        System.out.println("Game Started: " + status);
        return status;
    }

    public static int addPlayers(int count) {
        System.out.println("Players Joined: " + count);
        return count;
    }

    public static long totalPlayers(long count) {
        System.out.println("Total Players: " + count);
        return count;
    }

    public static float gameRating(float rating) {
        System.out.println("Rating: " + rating);
        return rating;
    }

    public static double totalRevenue(double amount) {
        System.out.println("Revenue: " + amount);
        return amount;
    }

    public static char gameVersion(char version) {
        System.out.println("Version: " + version);
        return version;
    }

    public static byte difficultyLevel(byte level) {
        System.out.println("Difficulty: " + level);
        return level;
    }

    public static String gameGenre(String genre) {
        System.out.println("Genre: " + genre);
        return genre;
    }

    public static boolean checkOnline(boolean status) {
        System.out.println("Online Available: " + status);
        return status;
    }

    public static boolean endGame(boolean status) {
        System.out.println("Game Ended: " + status);
        return status;
    }
}