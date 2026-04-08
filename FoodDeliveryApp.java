class FoodDeliveryApp {

    String appName;
    int numberOfUsers;
    int numberOfRestaurants;
    boolean hasOffers;
    boolean hasRatings;
    boolean hasLiveTracking;
    double averageDeliveryTime;
    int numberOfDeliveries;
    String CEOName;
    int establishedYear;

    public boolean placeOrder(String orderName) {
        System.out.println("Order Placed: " + orderName);
        return true;
    }

    public boolean cancelOrder(String orderName) {
        System.out.println("Order Cancelled: " + orderName);
        return true;
    }

    public boolean trackOrder(String orderName) {
        System.out.println("Tracking Order: " + orderName);
        return true;
    }

    public boolean rateRestaurant(String restaurantName, int rating) {
        System.out.println("Restaurant Rated: " + restaurantName + " Rating: " + rating);
        return true;
    }

    public boolean addOffer(String offerName) {
        System.out.println("Offer Added: " + offerName);
        return true;
    }

    public boolean removeOffer(String offerName) {
        System.out.println("Offer Removed: " + offerName);
        return true;
    }

    public boolean addRestaurant(String restaurantName) {
        System.out.println("Restaurant Added: " + restaurantName);
        return true;
    }

    public boolean removeRestaurant(String restaurantName) {
        System.out.println("Restaurant Removed: " + restaurantName);
        return true;
    }

    public boolean updateDeliveryTime(double newTime) {
        System.out.println("Average Delivery Time Updated: " + newTime + " mins");
        return true;
    }

    public String notifyUser(String message) {
        System.out.println("Notification Sent: " + message);
        return message;
    }
}