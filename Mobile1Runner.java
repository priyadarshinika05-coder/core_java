class Mobile1Runner {

    public static void main(String[] args) {

        Mobile1 mobileApp = new Mobile1();

        double price1 = mobileApp.getPriceByBrand("Samsung");
        System.out.println("Mobile Price: " + price1);
        double total1 = mobileApp.getTotalAmount(price1, 2, 5.5f);
        System.out.println("Total Price: " + total1);

        System.out.println("---------------");

        double price2 = mobileApp.getPriceByBrand("Apple");
        System.out.println("Mobile Price: " + price2);
        double total2 = mobileApp.getTotalAmount(price2, 1, 10f);
        System.out.println("Total Price: " + total2);

        System.out.println("---------------");

        double price3 = mobileApp.getPriceByBrand("OnePlus");
        System.out.println("Mobile Price: " + price3);
        double total3 = mobileApp.getTotalAmount(price3, 3, 7f);
        System.out.println("Total Price: " + total3);

        System.out.println("---------------");

        double price4 = mobileApp.getPriceByBrand("Vivo");
        System.out.println("Mobile Price: " + price4);
        double total4 = mobileApp.getTotalAmount(price4, 2, 4f);
        System.out.println("Total Price: " + total4);
		
		System.out.println("---------------");
		
		double price5 = mobileApp.getPriceByBrand("Oppo");
        System.out.println("Mobile Price: " + price5);
        double total5 = mobileApp.getTotalAmount(price5, 5, 8f);
        System.out.println("Total Price: " + total5);
    }
}