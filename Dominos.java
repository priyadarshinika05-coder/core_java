class Dominos {

    public double getPriceByPizzaName(String pizzaName) {
        System.out.println("Invoking getPriceByPizzaName: " + pizzaName);
        double price = 0.0;

        if ("Margherita"==pizzaName) {
            price = 99;
        } else if ("Farmhouse"==pizzaName) {
            price = 199;
        } else if ("Peppy Paneer"==pizzaName) {
            price = 229;
        } else if ("Veg Extravaganza"==pizzaName) {
            price = 249;
        } else if ("Chicken Dominator"==pizzaName) {
            price = 299;
        } else if ("Pepper Barbecue Chicken"==pizzaName) {
            price = 279;
        } else if ("Chicken Sausage"==pizzaName) {
            price = 259;
        } else if ("Paneer Makhani"==pizzaName) {
            price = 239;
        } else if ("Indi Tandoori Paneer"==pizzaName) {
            price = 269;
		} else if ("cone Paneer"==pizzaName) {
            price = 150;
		} else if ("veg Paneer"==pizzaName) {
            price = 269;
        } else {
            price = 0.0;
        }

        System.out.println("End of getPriceByPizzaName");
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