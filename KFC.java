class KFC {

    public double getPriceByItemName(String itemName) {
        System.out.println("Invoking getPriceByItemName: " + itemName);
        double price = 0.0;

        if ("Chicken Bucket"==itemName) {
            price = 499;
        } else if ("Zinger Burger"==itemName) {
            price = 199;
        } else if ("Chicken Popcorn"==itemName) {
            price = 179;
        } else if ("Hot Wings"==itemName) {
            price = 249;
        } else if ("Chicken Strips"==itemName) {
            price = 229;
        } else if ("Veg Burger"==itemName) {
            price = 149;
        } else if ("French Fries"==itemName) {
            price = 99;
        } else if ("Pepsi"==itemName) {
            price = 60;
        } else if ("Krushers"==itemName) {
            price = 120;
		} else if ("Grillied chicken"==itemName) {
            price = 299;
		} else if ("Shawarama"==itemName) {
            price = 280;
			
        } else {
            price = 0.0;
        }

        System.out.println("End of getPriceByItemName");
        return price;
    }

    public double getTotalAmount(double price, int quantity, float discount) {
        System.out.println("Invoking getTotalAmount");

        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        total = total - discountAmount;

        System.out.println("End of getTotalAmount");
        return total;
    }
}