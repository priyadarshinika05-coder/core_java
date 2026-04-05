class Movie {

    String name;
    String hero;
    double budget;
    String language;

    public Movie() {
        this("KGF", "Yash");
        System.out.println("Details 1st");
    }

    public Movie(String name) {
        System.out.println("Movie: " + name);
        System.out.println("Details 2nd");
    }

    public Movie(String name, String hero) {
        System.out.println("Movie: " + name);
        System.out.println("Hero: " + hero);
        System.out.println("Details 3rd");
    }

    public Movie(String name, String hero, double budget) {
        System.out.println("Movie: " + name);
        System.out.println("Hero: " + hero);
        System.out.println("Budget: " + budget);
        System.out.println("Details 4th");
    }

    public Movie(String name, String hero, double budget, String language) {
        System.out.println("Movie: " + name);
        System.out.println("Hero: " + hero);
        System.out.println("Budget: " + budget);
        System.out.println("Language: " + language);
        System.out.println("Details 5th");
    }
}