class Mobile1 {

    public double getPriceByBrand(String brandName) {
        System.out.println("Invoking getPriceByBrand: " + brandName);

        double price = 0.0;

        if ("Samsung"==brandName) {
            price = 25000;
        } else if ("Apple"==brandName) {
            price = 80000;
        } else if ("OnePlus"==brandName) {
            price = 35000;
        } else if ("Vivo"==brandName) {
            price = 20000;
        } else if ("Oppo"==brandName) {
            price = 18000;
        } else if ("Realme"==brandName) {
            price = 15000;
        } else if ("Redmi"==brandName) {
            price = 12000;
        } else if ("Nokia"==brandName) {
            price = 10000;
		} else if ("Motorola"==brandName) {
            price = 55000;
		} else if ("Xiaomi"==brandName) {
            price = 25000;
        } else {
            price = 0.0;
        }

        System.out.println("End of getPriceByBrand");
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