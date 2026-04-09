class KFCRunner {
    public static void main(String[] args) {

        KFC kfc = new KFC();

        double price1 = kfc.getPriceByItemName("Chicken Bucket");
        System.out.println("Item Price: " + price1);
        double total1 = kfc.getTotalAmount(price1, 2, 10f);
        System.out.println("Total Price: " + total1);

        System.out.println("---------------");

        double price2 = kfc.getPriceByItemName("Zinger Burger");
        System.out.println("Item Price: " + price2);
        double total2 = kfc.getTotalAmount(price2, 3, 5f);
        System.out.println("Total Price: " + total2);

        System.out.println("---------------");

        double price3 = kfc.getPriceByItemName("Chicken Popcorn");
        System.out.println("Item Price: " + price3);
        double total3 = kfc.getTotalAmount(price3, 1, 2f);
        System.out.println("Total Price: " + total3);

        System.out.println("---------------");

        double price4 = kfc.getPriceByItemName("French Fries");
        System.out.println("Item Price: " + price4);
        double total4 = kfc.getTotalAmount(price4, 4, 7f);
        System.out.println("Total Price: " + total4);
		
		System.out.println("---------------");

        double price5 = kfc.getPriceByItemName("Shawarama");
        System.out.println("Item Price: " + price5);
        double total5 = kfc.getTotalAmount(price5, 4, 7f);
        System.out.println("Total Price: " + total5);
    }
}