class Watch {

    public double getPriceByBrand(String brandName) {
        System.out.println("Invoking getPriceByBrand: " + brandName);

        double price = 0.0;

        if ("Titan"==brandName) {
            price = 3000;
        } else if ("Fastrack"==brandName) {
            price = 2500;
        } else if ("Casio"==brandName) {
            price = 4000;
        } else if ("Rolex"==brandName) {
            price = 50000;
        } else if ("Sonata"==brandName) {
            price = 1500;
        } else if ("Timex"==brandName) {
            price = 2800;
		} else if ("Omega"==brandName) {
            price = 3500;
		} else if ("vacheron"==brandName) {
            price = 2000;
		} else if ("Military"==brandName) {
            price = 5000;
		} else if ("Smart watch"==brandName) {
            price = 2500;
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