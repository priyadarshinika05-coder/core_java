class DominosRunner {
    public static void main(String[] args) {

        Dominos dominos = new Dominos();

        double price1 = dominos.getPriceByPizzaName("Margherita");
        System.out.println("Pizza Price: " + price1);
        double total1 = dominos.getTotalAmount(price1, 2, 5f);
        System.out.println("Total Price: " + total1);

        System.out.println("---------------");

        double price2 = dominos.getPriceByPizzaName("Farmhouse");
        System.out.println("Pizza Price: " + price2);
        double total2 = dominos.getTotalAmount(price2, 3, 10f);
        System.out.println("Total Price: " + total2);

        System.out.println("---------------");

        double price3 = dominos.getPriceByPizzaName("Chicken Dominator");
        System.out.println("Pizza Price: " + price3);
        double total3 = dominos.getTotalAmount(price3, 1, 3f);
        System.out.println("Total Price: " + total3);

        System.out.println("---------------");

        double price4 = dominos.getPriceByPizzaName("Paneer Makhani");
        System.out.println("Pizza Price: " + price4);
        double total4 = dominos.getTotalAmount(price4, 4, 8f);
        System.out.println("Total Price: " + total4);
		
		System.out.println("---------------");

        double price5 = dominos.getPriceByPizzaName("veg Paneer");
        System.out.println("Pizza Price: " + price5);
        double total5 = dominos.getTotalAmount(price5, 4, 8f);
        System.out.println("Total Price: " + total5);
    }
}