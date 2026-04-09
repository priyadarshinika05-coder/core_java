class BurgerKingRunner {
    public static void main(String[] args) {

        BurgerKing bk = new BurgerKing();

        double price1 = bk.getPriceByItemName("Veg Whopper");
        System.out.println("Item Price: " + price1);
        double total1 = bk.getTotalAmount(price1, 2, 5f);
        System.out.println("Total Price: " + total1);

        System.out.println("---------------");

        double price2 = bk.getPriceByItemName("Chicken Whopper");
        System.out.println("Item Price: " + price2);
        double total2 = bk.getTotalAmount(price2, 3, 10f);
        System.out.println("Total Price: " + total2);

        System.out.println("---------------");

        double price3 = bk.getPriceByItemName("Crispy Veg Burger");
        System.out.println("Item Price: " + price3);
        double total3 = bk.getTotalAmount(price3, 4, 7f);
        System.out.println("Total Price: " + total3);

        System.out.println("---------------");

        double price4 = bk.getPriceByItemName("Chicken Nuggets");
        System.out.println("Item Price: " + price4);
        double total4 = bk.getTotalAmount(price4, 1, 3f);
        System.out.println("Total Price: " + total4);
		
		System.out.println("---------------");

        double price5 = bk.getPriceByItemName("Chickentandoorcheese");
        System.out.println("Item Price: " + price5);
        double total5 = bk.getTotalAmount(price5, 1, 3f);
        System.out.println("Total Price: " + total5);
    }
}