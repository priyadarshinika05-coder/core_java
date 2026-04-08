class Spacecraft {

    String name;
    String agency;
    int crew;
    long missions;
    String destination;
    boolean hasAI;
    boolean reusable;
    float speed;
    double cost;
    char type;
    byte stages;

    public static boolean launch(boolean status) {
        System.out.println("Launch: " + status);
        return status;
    }

    public static int addCrew(int count) {
        System.out.println("Crew Added: " + count);
        return count;
    }

    public static long totalMissions(long count) {
        System.out.println("Missions: " + count);
        return count;
    }

    public static float setSpeed(float speed) {
        System.out.println("Speed: " + speed);
        return speed;
    }

    public static double missionCost(double cost) {
        System.out.println("Cost: " + cost);
        return cost;
    }

    public static char spacecraftType(char type) {
        System.out.println("Type: " + type);
        return type;
    }

    public static byte stageCount(byte count) {
        System.out.println("Stages: " + count);
        return count;
    }

    public static String destination(String dest) {
        System.out.println("Destination: " + dest);
        return dest;
    }

    public static boolean checkAI(boolean status) {
        System.out.println("AI Available: " + status);
        return status;
    }

    public static boolean land(boolean status) {
        System.out.println("Landing: " + status);
        return status;
    }
}