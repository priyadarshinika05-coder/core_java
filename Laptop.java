class Laptop {

    public double getPriceByBrand(String brand) {
        System.out.println("Invoking getPriceByBrand: " + brand);

        double price = 0.0;

        if ("HP"==brand) {
            price = 55000;
        } else if ("Dell"==brand) {
            price = 60000;
        } else if ("Lenovo"==brand) {
            price = 50000;
        } else if ("Asus"==brand) {
            price = 65000;
        } else if ("Acer"==brand) {
            price = 48000;
        } else if ("Apple"==brand) {
            price = 120000;
        } else if ("MSI"==brand) {
            price = 90000;
        } else if ("Samsung"==brand) {
            price = 70000;
		} else if ("Razer"==brand) {
            price = 80000;
		} else if ("Microsoft"==brand) {
            price = 50000;
		} else if ("Alienware"==brand) {
            price = 75000;
        } else {
            price = 0.0;
        }

        System.out.println("End of getPriceByBrand");
        return price;
    }

    public double getTotalAmountByPriceAndQuantity(double price, int quantity, float discount) {
        System.out.println("Invoking getTotalAmount");

        double totalPrice = price * quantity;
        double discountAmount = totalPrice * (discount / 100);
        totalPrice = totalPrice - discountAmount;

        System.out.println("End of getTotalAmount");
        return totalPrice;
    }
}