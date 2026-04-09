class Flipkart {

    public double getPriceByProductName(String productName) {
        System.out.println("Invoking getPriceByProductName: " + productName);
        double price = 0.0;

        if ("Laptop"==productName) {
            price = 55000;
        } else if ("Mobile"==productName) {
            price = 20000;
        } else if ("Headphones"==productName) {
            price = 1500;
        } else if ("Smart Watch"==productName) {
            price = 3000;
        } else if ("Tablet"==productName) {
            price = 25000;
        } else if ("Camera"==productName) {
            price = 45000;
        } else if ("Shoes"==productName) {
            price = 2000;
        } else if ("Backpack"==productName) {
            price = 1200;
        } else if ("TV"==productName) {
            price = 40000;
		} else if ("Refrigerator"==productName) {
            price = 45000;
		} else if ("Earbubs"==productName) {
            price = 2000;
        } else {
            price = 0.0;
        }

        System.out.println("End of getPriceByProductName");
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