class FlipkartRunner {
    public static void main(String[] args) {

        Flipkart flipkart = new Flipkart();

        double price1 = flipkart.getPriceByProductName("Laptop");
        System.out.println("Product Price: " + price1);
        double total1 = flipkart.getTotalAmount(price1, 1, 10f);
        System.out.println("Total Price: " + total1);

        System.out.println("---------------");

        double price2 = flipkart.getPriceByProductName("Mobile");
        System.out.println("Product Price: " + price2);
        double total2 = flipkart.getTotalAmount(price2, 2, 5f);
        System.out.println("Total Price: " + total2);

        System.out.println("---------------");

        double price3 = flipkart.getPriceByProductName("Headphones");
        System.out.println("Product Price: " + price3);
        double total3 = flipkart.getTotalAmount(price3, 3, 7f);
        System.out.println("Total Price: " + total3);

        System.out.println("---------------");

        double price4 = flipkart.getPriceByProductName("TV");
        System.out.println("Product Price: " + price4);
        double total4 = flipkart.getTotalAmount(price4, 1, 12f);
        System.out.println("Total Price: " + total4);
		
		 System.out.println("---------------");

        double price5 = flipkart.getPriceByProductName("Refrigerator");
        System.out.println("Product Price: " + price5);
        double total5 = flipkart.getTotalAmount(price5, 1, 12f);
        System.out.println("Total Price: " + total5);
    }
}