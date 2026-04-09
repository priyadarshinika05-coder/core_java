class BurgerKing {

    public double getPriceByItemName(String itemName) {
        System.out.println("Invoking getPriceByItemName: " + itemName);
        double price = 0.0;

        if ("Veg Whopper"==itemName) {
            price = 169;
        } else if ("Chicken Whopper"==itemName) {
            price = 199;
        } else if ("Crispy Veg Burger"==itemName) {
            price = 99;
        } else if ("Crispy Chicken Burger"==itemName) {
            price = 129;
        } else if ("French Fries"==itemName) {
            price = 109;
        } else if ("Chicken Nuggets"==itemName) {
            price = 149;
        } else if ("Veg Nuggets"==itemName) {
            price = 139;
        } else if ("Coke"==itemName) {
            price = 60;
        } else if ("ChocolateShake"==itemName) {
            price = 120;
		} else if ("Chickenchillicheese"==itemName) {
            price = 79;
		} else if ("Chickentandoorcheese"==itemName) {
            price = 139;
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