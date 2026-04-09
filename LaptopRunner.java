class LaptopRunner {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();

        double price1 = laptop.getPriceByBrand("HP");
        System.out.println("Laptop Price: " + price1);
        double total1 = laptop.getTotalAmountByPriceAndQuantity(price1, 2, 5.0f);
        System.out.println("Total Price: " + total1);

        System.out.println("---------------");

        double price2 = laptop.getPriceByBrand("Dell");
        System.out.println("Laptop Price: " + price2);
        double total2 = laptop.getTotalAmountByPriceAndQuantity(price2, 1, 10.0f);
        System.out.println("Total Price: " + total2);

        System.out.println("---------------");

        double price3 = laptop.getPriceByBrand("Apple");
        System.out.println("Laptop Price: " + price3);
        double total3 = laptop.getTotalAmountByPriceAndQuantity(price3, 3, 8.5f);
        System.out.println("Total Price: " + total3);
		
		System.out.println("---------------");
		 
		double price4 = laptop.getPriceByBrand("Lenovo");
        System.out.println("Laptop Price: " + price4);
        double total4 = laptop.getTotalAmountByPriceAndQuantity(price3, 3, 8.5f);
        System.out.println("Total Price: " + total4);
		
		System.out.println("---------------");
		
		double price5 = laptop.getPriceByBrand("Samsung");
        System.out.println("Laptop Price: " + price5);
        double total5 = laptop.getTotalAmountByPriceAndQuantity(price3, 3, 8.5f);
        System.out.println("Total Price: " + total5);
    }
}