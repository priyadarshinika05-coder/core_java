class WatchRunner {

    public static void main(String[] args) {

        Watch watch = new Watch();

        double price1 = watch.getPriceByBrand("Titan");
        System.out.println("Watch Price: " + price1);
        double total1 = watch.getTotalAmount(price1, 2, 5f);
        System.out.println("Total Price: " + total1);

        System.out.println("---------------");

        double price2 =watch.getPriceByBrand("Fastrack");
        System.out.println("Watch Price: " + price2);
        double total2 =watch.getTotalAmount(price2, 3, 7.5f);
        System.out.println("Total Price: " + total2);

        System.out.println("---------------");

        double price3 =watch.getPriceByBrand("Casio");
        System.out.println("Watch Price: " + price3);
        double total3 =watch.getTotalAmount(price3, 1, 10f);
        System.out.println("Total Price: " + total3);

        System.out.println("---------------");

        double price4 =watch.getPriceByBrand("Rolex");
        System.out.println("Watch Price: " + price4);
        double total4 =watch.getTotalAmount(price4, 1, 15f);
        System.out.println("Total Price: " + total4);
		
		System.out.println("---------------");
		
		double price5 =watch.getPriceByBrand("Smart watch");
        System.out.println("Watch Price: " + price5);
        double total5 =watch.getTotalAmount(price5, 1, 15f);
        System.out.println("Total Price: " + total5);
    }
}